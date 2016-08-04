package com.everis.ideaton.service;

import com.everis.ideaton.domain.User;

import java.math.BigInteger;
import java.util.List;

public interface UserService {

    public List<User> getAllUsers() throws RuntimeException;

    public User getUserById(BigInteger id) throws RuntimeException;

    public User saveUser(User user) throws RuntimeException;

    public boolean deleteUser(BigInteger id) throws RuntimeException;

    public User updateUser(User user) throws RuntimeException;
}
