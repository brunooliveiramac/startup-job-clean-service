package com.clean.core.dataproviders.database.job;

import javax.persistence.*;

@Entity
public class Job {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "job_id")
    private int id;

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

    @Column
    private double salary;

    @Enumerated(EnumType.STRING)
    @Column(name = "job_type")
    private JobType jobType;

    public Job() {
    }

    public Job(String name, int quantity, double salary, JobType jobType, Company company) {
        this.name = name;
        this.quantity = quantity;
        this.salary = salary;
        this.jobType = jobType;
        this.company = company;
    }

    public double getSalary() {
        return salary;
    }

    public String getDescription() {
        return description;
    }

    public JobType getJobType() {
        return jobType;
    }

    public int getId() {
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
