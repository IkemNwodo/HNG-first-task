package com.ikem.hngfirsttask;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class ProfileData {
    private String slackUsername;
    private Boolean backend;
    private Integer age;
    private String bio;
}
