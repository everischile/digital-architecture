package com.everis.ideaton.service;

import com.everis.ideaton.domain.Idea;

import java.math.BigInteger;
import java.util.List;

public interface IdeaService {

    public List<Idea> getAllIdeas() throws RuntimeException;

    public Idea getIdeaById(BigInteger id) throws RuntimeException;

    public Idea saveIdea(Idea idea) throws RuntimeException;

    public boolean deleteIdea(BigInteger id) throws RuntimeException;

    public Idea updateIdea(Idea idea) throws RuntimeException;
}
