package com.example.demo.shared.entity;

import jakarta.persistence.EntityListeners;
import jakarta.persistence.MappedSuperclass;
import lombok.Data;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

@Data
@MappedSuperclass
@EntityListeners(AuditingEntityListener.class) // Annotation designates a super class that JPA entities inherit from.
abstract public class BaseEntity {
    /**
     * @CreatedDate annotation indicates we will save a timestamp when a record is created
     */
    @CreatedDate
    private Long createdAt;

    /**
     * @LastModifiedDate annotation indicates we will be updating timestamp when record is updated.
     */
    @LastModifiedDate
    private Long lastModified;
}
