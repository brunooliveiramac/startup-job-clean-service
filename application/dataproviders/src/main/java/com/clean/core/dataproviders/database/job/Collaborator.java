package com.clean.core.dataproviders.database.job;

import javax.persistence.*;
import java.util.List;

@Entity
public class Collaborator {

    @Id
    @GeneratedValue
    @Column(name = "collaborator_id")
    private Integer id;

    private String name;

    @OneToMany(mappedBy = "collaborator", cascade = CascadeType.ALL)
    private List<Job> jobs;

    public Collaborator() {
    }
}
