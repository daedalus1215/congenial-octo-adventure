package com.example.demo.account;

import com.example.demo.DemoApplication;
import com.example.demo.account.entity.Customer;
import com.example.demo.account.entity.account.*;
import com.example.demo.account.repository.CustomerRepository;
import com.mysql.cj.exceptions.AssertionFailedException;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Optional;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = DemoApplication.class)
@ActiveProfiles(profiles = "test")
public class DemoApplicationIntegrationTest {

    @Autowired
    private CustomerRepository customerRepository;

    @Test
    public void customerTest() {
        final Account account = new Account("12345");
        final Customer customer = new Customer("Jane", "Doe", "jane.doe@gmail.com", account);
        final CreditCard creditCard = new CreditCard("1234567890", CreditCardType.VISA);
        customer.getAccount().getCreditCards().add(creditCard);

        final String street1 = "1600 Pennsylvania Ave NW";
        final Address address = new Address(street1, null, "DC", "Washington", "United States", 20500, AddressType.SHIPPING);
        customer.getAccount().getAddresses().add(address);

        customerRepository.save(customer);

        Optional<Customer> byId = customerRepository.findById(customer.getId());
        Customer persistedResult = byId.get();

        Assert.assertNotNull(persistedResult.getAccount());
        Assert.assertNotNull(persistedResult.getCreatedAt());
        Assert.assertNotNull(persistedResult.getLastModified());

        Assert.assertTrue(persistedResult.getAccount().getAddresses().stream()
                .anyMatch(add -> add.getStreet1().equalsIgnoreCase(street1)));

        customerRepository.findByEmailContaining(customer.getEmail())
                .orElseThrow(
                        () -> new AssertionFailedException(new RuntimeException(
                                "there's supposed to be a matching record!")));
    }
}
