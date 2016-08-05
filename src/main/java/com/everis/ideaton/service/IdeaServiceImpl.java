package com.everis.ideaton.service;

import com.everis.ideaton.domain.Idea;
import com.everis.ideaton.repository.MongoIdeaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.math.BigInteger;
import java.util.List;

@Service
@Transactional
public class IdeaServiceImpl implements IdeaService {

    @Autowired
    private MongoIdeaRepository mongoIdeaRepository;

    @Override
    public List<Idea> getAllIdeas() throws RuntimeException {
        return mongoIdeaRepository.findAll();
    }

    @Override
    public Idea getIdeaById(BigInteger id) throws RuntimeException {
        return mongoIdeaRepository.findOne(id);
    }

    @Override
    public Idea saveIdea(Idea idea) throws RuntimeException {
        return mongoIdeaRepository.save(idea);
    }

    @Override
    public boolean deleteIdea(BigInteger id) throws RuntimeException {
        mongoIdeaRepository.delete(id);
        return true;
    }

    @Override
    public Idea updateIdea(Idea idea) throws RuntimeException {
        return mongoIdeaRepository.save(idea);
    }
}
