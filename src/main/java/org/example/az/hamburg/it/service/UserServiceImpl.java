package org.example.az.hamburg.it.service;

import jdk.internal.foreign.LayoutPath;
import org.apache.catalina.User;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;
@Service
public class UserServiceImpl implements UserService {

    @Override
    public UserResponse save(UserRequest request) {
        User user =new User();
        user.setUsername(request.getUsername());
        user.setPassword(request.getPssword());
        userRepository.save(user);
        return new UserResponse(user.getId(), user.getUsername());
    }

    @Override
    public List<UserResponse> getAll() {
        return userRepository.findAll().stream().
                map(user -> new UserResponse(user.getId(), user.getUsername())).
                collect(Collectors.toList());
    }

    @Override
    public UserResponse getById(Long id) {
        User user =userRepository.findById(id).orElseThrow();
        return new UserReponse(user.getId(),user.getUsername());
    }

    @Override
    public void delete(Long id) {
        userRepository.deleteById(id);

    }
}
