package com.clean.core.entity;

import java.util.List;

public class JobDomain {

    private List<CollaboratorDomain> collaborators;

    private CompanyDomain company;

    private Integer jobId;

    private String description;

    private String name;

    private Category category;

    public String description() {
        return description;
    }

    public static class Builder {

        private String description;


        private Builder() {
            //Not implemented
        }

        public static final Builder create() {
            return new Builder();
        }

        public Builder description(String description) {
            this.description = description;
            return this;
        }


        public JobDomain build() {
            JobDomain job = new JobDomain();
            job.description = description;
            return job;
        }


    }

}
