package com.everis.ideaton.service;

import com.everis.ideaton.domain.User;
import com.everis.ideaton.domain.dto.UserDto;
import com.everis.ideaton.repository.MongoUserRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
@Slf4j
public class UserServiceImpl implements UserService {

    private MongoUserRepository mongoUserRepository;

    @Autowired
    public UserServiceImpl(MongoUserRepository mongoUserRepository) {
        this.mongoUserRepository = mongoUserRepository;
    }

    @Override
    public List<User> getAllUsers() throws RuntimeException {
        return mongoUserRepository.findAll();
    }

    @Override
    public User getUserById(String id) throws RuntimeException {
        return mongoUserRepository.findOne(id);
    }

    @Override
    public User saveUser(UserDto userDto) throws RuntimeException {

        User user = User.builder().firstName(userDto.getFirstName()).lastName(userDto.getFirstName())
                .email(userDto.getEmail()).city(userDto.getCity()).country(userDto.getCountry())
                .region(userDto.getRegion()).signedWith(userDto.getSignedWith()).build();

        mongoUserRepository.save(user);
        return mongoUserRepository.findOne(user.getId());
    }

    @Override
    public boolean deleteUser(String id) throws RuntimeException {
        mongoUserRepository.delete(id);
        return true;
    }

    @Override
    public User updateUser(UserDto userDto) throws RuntimeException {
        return saveUser(userDto);
    }
}
