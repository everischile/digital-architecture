package com.everis.ideaton.service;

import com.everis.ideaton.domain.User;
import com.everis.ideaton.domain.dto.UserDto;

import java.util.List;

public interface UserService {

    List<User> getAllUsers() throws RuntimeException;

    User getUserById(String id) throws RuntimeException;

    User saveUser(UserDto userDto) throws RuntimeException;

    boolean deleteUser(String id) throws RuntimeException;

    User updateUser(UserDto userDto) throws RuntimeException;
}
