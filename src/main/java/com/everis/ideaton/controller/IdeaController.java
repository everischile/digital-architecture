package com.everis.ideaton.controller;

import com.everis.ideaton.domain.Idea;
import com.everis.ideaton.service.IdeaService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletResponse;
import java.math.BigInteger;
import java.util.List;

@RequestMapping("/idea")
@RestController
@Api(value = "idea", description = "idea operations")
public class IdeaController {

    @Autowired
    private IdeaService ideaService;

    @ApiOperation("Returns all the ideas")
    @RequestMapping(method = RequestMethod.GET)
    public List<Idea> getIdeas() throws RuntimeException{
        return ideaService.getAllIdeas();
    }

    @ApiOperation("Find Idea by Id")
    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public Idea getIdeaById(@PathVariable("id") BigInteger id) throws RuntimeException{
        return ideaService.getIdeaById(id);
    }

    @ApiOperation("Add a new Idea")
    @ResponseStatus(HttpStatus.CREATED)
    @RequestMapping(method = RequestMethod.POST)
    public Idea saveIdea(@RequestBody Idea idea, HttpServletResponse response) throws RuntimeException {
        return ideaService.saveIdea(idea);
    }

    @ApiOperation("Updates an Idea")
    @RequestMapping(method = RequestMethod.PUT)
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public Idea updateIdea(@RequestBody Idea idea, HttpServletResponse response) throws RuntimeException {
        return ideaService.updateIdea(idea);
    }

    @ApiOperation("Deletes an existing Idea")
    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    public void deleteUser(@PathVariable("id") BigInteger id) throws RuntimeException {
        ideaService.deleteIdea(id);
    }
}
