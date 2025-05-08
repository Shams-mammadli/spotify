package org.example.az.hamburg.it.service;

import java.util.List;

public interface UserService {
    UserResponse save(UserRequest request);
    List<UserResponse> getAll();
    UserResponse getById(Long id);
    void delete(Long id);
}
