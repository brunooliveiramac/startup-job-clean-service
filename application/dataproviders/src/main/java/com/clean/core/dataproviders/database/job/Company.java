package com.clean.core.dataproviders.database.job;


import javax.persistence.*;
import java.util.List;

@Entity
public class Company {

    @Id
    @GeneratedValue
    @Column(name = "company_id")
    private Integer id;

    private String name;

    @OneToMany(mappedBy = "company", cascade = CascadeType.ALL)
    private List<Job> jobs;

    public Company() {
    }
}
