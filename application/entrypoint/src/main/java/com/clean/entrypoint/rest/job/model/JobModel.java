package com.clean.entrypoint.rest.job.model;

import com.clean.core.entity.Category;
import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.ANY,
        getterVisibility = JsonAutoDetect.Visibility.ANY, isGetterVisibility = JsonAutoDetect.Visibility.NONE)
@JsonIgnoreProperties(ignoreUnknown = true)
public class JobModel {

    private Integer jobId;

    private String desciption;

    private String name;

    private int quantity;

    private String company;

    private String local;

    private Category category;

    public static class Builder {

        private String description;
        private String name;
        private int quantity;
        private String company;
        private String local;



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

        public Builder name(String name) {
            this.name = name;
            return this;
        }

        public Builder local(String local) {
            this.local = local;
            return this;
        }

        public Builder quantity(int quantity) {
            this.quantity = quantity;
            return this;
        }

        public Builder company(String company) {
            this.company = company;
            return this;
        }

        public JobModel build() {
            JobModel job = new JobModel();
            job.desciption = description;
            job.company = company;
            job.quantity = quantity;
            job.name = name;
            job.local = local;
            return job;
        }


    }

}
