package com.neo4j.backend.dao;

import com.neo4j.backend.dto.request.UserRequest;
import com.neo4j.backend.dto.response.UserResponse;

public interface UserDao {

    public UserResponse signup(UserRequest request);
    public UserResponse login(UserRequest request);
    public UserResponse addTask(String email, String task);
}
