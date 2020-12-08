package com.practicing.usermanager.resource;

import com.practicing.usermanager.entity.User;
import com.practicing.usermanager.exception.ExceptionHandling;
import com.practicing.usermanager.exception.domain.EmailExistException;
import com.practicing.usermanager.exception.domain.UserNotFoundException;
import com.practicing.usermanager.exception.domain.UsernameExistException;
import com.practicing.usermanager.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = {"/", "user"})
public class UserResource extends ExceptionHandling {

    private UserService userService;

    @Autowired
    public UserResource(UserService userService) {
        this.userService = userService;
    }

    @PostMapping("/register")
    public ResponseEntity<User> register(@RequestBody User user) throws UserNotFoundException, UsernameExistException, EmailExistException {
        User newUser = userService.register(user.getFirstName(), user.getLastName(), user.getUsername(), user.getEmail());
        return new ResponseEntity<>(newUser, HttpStatus.OK);
    }
}
