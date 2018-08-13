package com.clean.entrypoint.rest.job.dto;

import com.clean.core.entity.Category;
import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.ANY,
        getterVisibility = JsonAutoDetect.Visibility.ANY, isGetterVisibility = JsonAutoDetect.Visibility.NONE)
@JsonIgnoreProperties(ignoreUnknown = true)
public class JobDto {

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


        public JobDto build() {
            JobDto job = new JobDto();
            job.desciption = description;
            return job;
        }


    }

}
