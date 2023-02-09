package com.example.microservice_project.service;



import com.example.microservice_project.entity.User;

import java.util.List;

public interface UserService {
    User saveUser(User user);//Create
    List<User> getAllUser();// getAllUser

    User getUser(String userId);//get Single User

}
