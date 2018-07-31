package com.clean.core.dataproviders.database.job;

import javax.persistence.*;

@Entity
public class Category {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer categoryId;

    @Column
    private String name;

    public Category() {
    }
}
