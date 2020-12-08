package com.practicing.usermanager.service;

import com.practicing.usermanager.entity.User;
import com.practicing.usermanager.exception.domain.EmailExistException;
import com.practicing.usermanager.exception.domain.UserNotFoundException;
import com.practicing.usermanager.exception.domain.UsernameExistException;

import java.util.List;

public interface UserService {

    User register(String firstName,String lastName,String username,String email) throws UserNotFoundException, UsernameExistException, EmailExistException;

    List<User> getUsers();

    User findUserByUsername(String username);

    User findUserByEmail(String email);

}
