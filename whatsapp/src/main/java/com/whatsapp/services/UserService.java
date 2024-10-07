package com.whatsapp.services;

import com.whatsapp.entity.User;
import com.whatsapp.exception.UserException;
import com.whatsapp.payload.UpdateUserRequest;

import java.util.List;

public interface UserService {

    public User findUserById(Integer id) throws UserException;

    public User findUserProfile(String jwt) throws UserException;

    public User updateUser(Integer userId, UpdateUserRequest req) throws UserException;

    public List<User> searchUser(String query);
}