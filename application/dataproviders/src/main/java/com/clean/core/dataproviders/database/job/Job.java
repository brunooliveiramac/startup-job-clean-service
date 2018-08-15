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

    @Column
    private int quantity;

    @Column
    private String local;

    @ManyToOne
    @JoinColumn(name = "category_id")
    private Category category;

    @ManyToOne
    @JoinColumn(name = "company_id")
    private Company company;

    @ManyToOne
    @JoinColumn(name = "collaborator_id")
    private Collaborator collaborator;


    public String getDescription() {
        return description;
    }

    public Integer getId() {
        return id;
    }

    public String getLocal() {
        return local;
    }

    public String getName() {
        return name;
    }

    public int getQuantity() {
        return quantity;
    }

    public Category getCategory() {
        return category;
    }

    public Company getCompany() {
        return company;
    }

    public Collaborator getCollaborator() {
        return collaborator;
    }
}
