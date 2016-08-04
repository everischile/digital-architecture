package com.everis.ideaton.service;

import com.everis.ideaton.domain.User;
import com.everis.ideaton.repository.MongoDataBaseOperations;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.math.BigInteger;
import java.util.List;

@Service
@Transactional
public class UserServiceImpl implements UserService {

    @Autowired
    private MongoDataBaseOperations mongoDataBaseOperations;

    @Override
    public List<User> getAllUsers() throws RuntimeException {
        return mongoDataBaseOperations.findAll();
    }

    @Override
    public User getUserById(BigInteger id) throws RuntimeException {
        return mongoDataBaseOperations.findOne(id);
    }

    @Override
    public User saveUser(User user) throws RuntimeException {
        mongoDataBaseOperations.save(user);
        return mongoDataBaseOperations.findOne(user.getId());
    }

    @Override
    public boolean deleteUser(BigInteger id) throws RuntimeException {
        mongoDataBaseOperations.delete(id);
        return true;
    }

    @Override
    public User updateUser(User user) throws RuntimeException {
        return mongoDataBaseOperations.save(user);
    }
}
