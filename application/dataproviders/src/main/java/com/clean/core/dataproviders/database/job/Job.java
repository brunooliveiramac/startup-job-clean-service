package com.clean.core.dataproviders.database.job;

import javax.persistence.*;

@Entity
public class Job {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "job_id")
    private Integer id;

    @Column
    private String description;

    @Column
    private String name;

    @ManyToOne
    @JoinColumn(name = "category_id")
    private Category category;

    @ManyToOne
    @JoinColumn(name = "company_id")
    private Company company;

    @ManyToOne
    @JoinColumn(name = "collaborator_id")
    private Collaborator collaborator;


    public String description() {
        return description;
    }
}
