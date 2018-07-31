package com.clean.core.entity;

public class JobDomain {

    private Integer jobId;

    private String desciption;

    private String name;

    private Category category;

    public static class Builder {

        private String description;


        private Builder() {
            //Not implemented
        }

        public static final Builder create() {
            return new Builder();
        }

        public Builder desciption(String desciption) {
            this.description = desciption;
            return this;
        }


        public JobDomain build() {
            JobDomain job = new JobDomain();
            job.desciption = description;
            return job;
        }


    }

}
