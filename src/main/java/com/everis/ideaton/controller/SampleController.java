package com.everis.ideaton.controller;

import com.everis.ideaton.domain.User;
import lombok.extern.log4j.Log4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@Log4j
@RestController
public class SampleController {

    @Autowired
    private MongoTemplate mongoTemplate;

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public Map<Long, Book> sayHello() {
        return BookFactory.getBookStore();
    }

    @RequestMapping(value = "/mongo", method = RequestMethod.GET)
    public String getMongoDat() {
        User user = new User("rafael","carrasco");
        mongoTemplate.insert(user, "user");
        return mongoTemplate.getCollection("user").findOne().toString();
    }

}
