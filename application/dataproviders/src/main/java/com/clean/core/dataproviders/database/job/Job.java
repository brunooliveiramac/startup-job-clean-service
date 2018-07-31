package com.clean.core.dataproviders.database.job;

import javax.persistence.*;

@Entity
public class Job {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer jobId;

    @Column
    private String desciption;

    @Column
    private String name;

    @ManyToOne
    @JoinColumn(name = "category_id")
    private Category category;


    public String description() {
        return desciption;
    }
}
