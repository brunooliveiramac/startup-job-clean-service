package com.clean.core.entity;

import java.util.List;

public class JobDomain {

    private List<CollaboratorDomain> collaborators;

    private String company;

    private Integer jobId;

    private String description;

    private String local;

    private String name;

    private int quantity;

    private Category category;

    private JobTypeDomain jobTypeDomain;

    private double salary;

    public double salary() {
        return salary;
    }

    public void salary(double salary){
        this.salary = salary;
    }

    public String description() {
        return description;
    }

    public List<CollaboratorDomain> collaborators() {
        return collaborators;
    }

    public String company() {
        return company;
    }

    public Integer jobId() {
        return jobId;
    }

    public String local() {
        return local;
    }

    public String name() {
        return name;
    }

    public int quantity() {
        return quantity;
    }

    public Category category() {
        return category;
    }

    public int id() {
        return jobId;
    }

    public JobTypeDomain getJobTypeDomain() {
        return jobTypeDomain;
    }

    public static class Builder {

        private int id;
        private String description;
        private String name;
        private String company;
        private String local;
        private int quantity;
        private double salary;
        private JobTypeDomain jobTypeDomain;



        private Builder() {
            //Not implemented
        }

        public static final Builder create() {
            return new Builder();
        }


        public Builder id(int id) {
            this.id = id;
            return this;
        }

        public Builder type(JobTypeDomain jobTypeDomain) {
            this.jobTypeDomain = jobTypeDomain;
            return this;
        }

        public Builder description(String description) {
            this.description = description;
            return this;
        }

        public Builder name(String name) {
            this.name = name;
            return this;
        }

        public Builder local(String local) {
            this.local = local;
            return this;
        }

        public Builder quantity(int qtd) {
            this.quantity = qtd;
            return this;
        }

        public Builder company(String company) {
            this.company = company;
            return this;
        }

        public Builder salary(double salary) {
            this.salary = salary;
            return this;
        }

        public JobDomain build() {
            JobDomain job = new JobDomain();
            job.description = description;
            job.name = name;
            job.company = company;
            job.local = local;
            job.quantity = quantity;
            job.jobId = id;
            job.jobTypeDomain = jobTypeDomain;
            job.salary = salary;
            return job;
        }
    }

}
