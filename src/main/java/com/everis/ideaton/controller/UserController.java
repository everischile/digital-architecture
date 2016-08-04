package com.everis.ideaton.controller;

import com.everis.ideaton.domain.User;
import com.everis.ideaton.service.UserService;
import com.wordnik.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.util.Assert;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletResponse;
import java.math.BigInteger;
import java.util.List;

@RequestMapping("/user")
@RestController
@Api(value = "ideaton-api", description = "user api")
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping(method = RequestMethod.GET)
    public List<User> getUsers() throws RuntimeException{
        return userService.getAllUsers();
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public User getUserById(@PathVariable("id") BigInteger id) throws RuntimeException{
        return userService.getUserById(id);
    }

    @ResponseStatus(HttpStatus.CREATED)
    @RequestMapping(method = RequestMethod.POST)
    public User saveUser(@RequestBody User user, HttpServletResponse response) throws RuntimeException {
        return userService.saveUser(user);
    }

    @RequestMapping(method = RequestMethod.PUT)
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public User updateUser(@RequestBody User user, HttpServletResponse response) throws RuntimeException {
        return userService.updateUser(user);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    public void deleteUser(@PathVariable("id") BigInteger id) throws RuntimeException {
        userService.deleteUser(id);
    }
}
