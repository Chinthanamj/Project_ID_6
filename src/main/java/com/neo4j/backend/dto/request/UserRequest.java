package com.neo4j.backend.dto.request;

import lombok.Data;

import java.util.List;

@Data
public class UserRequest {

    private String email;
    private String password;
    private List<String> tasks;
}
