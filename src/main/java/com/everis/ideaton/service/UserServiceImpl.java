package com.everis.ideaton.service;

import com.everis.ideaton.domain.User;
import com.everis.ideaton.repository.MongoUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.math.BigInteger;
import java.util.List;

@Service
@Transactional
public class UserServiceImpl implements UserService {

    @Autowired
    private MongoUserRepository mongoUserRepository;

    @Override
    public List<User> getAllUsers() throws RuntimeException {
        return mongoUserRepository.findAll();
    }

    @Override
    public User getUserById(BigInteger id) throws RuntimeException {
        return mongoUserRepository.findOne(id);
    }

    @Override
    public User saveUser(User user) throws RuntimeException {
        mongoUserRepository.save(user);
        return mongoUserRepository.findOne(user.getId());
    }

    @Override
    public boolean deleteUser(BigInteger id) throws RuntimeException {
        mongoUserRepository.delete(id);
        return true;
    }

    @Override
    public User updateUser(User user) throws RuntimeException {
        return mongoUserRepository.save(user);
    }
}
