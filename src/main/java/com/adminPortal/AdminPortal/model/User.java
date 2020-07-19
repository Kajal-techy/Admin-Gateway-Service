package com.adminPortal.AdminPortal.model;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
public class User {

    private String id;

    private String firstName;

    private String lastName;

    private String userName;

    private String password;

    private String loggedInUserId;
}

