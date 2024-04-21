package com.dbs.investment.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import org.hibernate.annotations.SoftDelete;
import org.hibernate.annotations.SoftDeleteType;

@Entity
//@SoftDelete(strategy = SoftDeleteType.ACTIVE)
public class Product {
    @Id
    private Long id;
    private String name;
    private String description;

    protected Product() {

    }
    public Long getId() {
        return id;
    }

    public String getDescription() {
        return description;
    }

    public String getName() {
        return name;
    }
}
