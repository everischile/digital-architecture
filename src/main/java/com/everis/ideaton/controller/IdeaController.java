package com.everis.ideaton.controller;

import com.everis.ideaton.domain.Idea;
import com.everis.ideaton.domain.dto.*;
import com.everis.ideaton.service.IdeaService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletResponse;
import java.util.List;

@RequestMapping("/idea")
@RestController
@Api(value = "idea", description = "idea operations")
public class IdeaController {

    private final IdeaService ideaService;

    @Autowired
    public IdeaController(IdeaService ideaService) {
        this.ideaService = ideaService;
    }

    @ApiOperation("Returns all the ideas")
    @RequestMapping(method = RequestMethod.GET)
    public List<Idea> getIdeas() throws RuntimeException{
        return ideaService.getAllIdeas();
    }

    @ApiOperation("Find Idea by Id")
    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public Idea getIdeaById(@PathVariable("id") String id) throws RuntimeException{
        return ideaService.getIdeaById(id);
    }

    @ApiOperation("Add a new Idea")
    @ResponseStatus(HttpStatus.CREATED)
    @RequestMapping(method = RequestMethod.POST)
    public Idea saveIdea(@RequestBody IdeaDto ideaDto, HttpServletResponse response) throws RuntimeException {
        return ideaService.saveIdea(ideaDto);
    }

    @ApiOperation("Updates an Idea")
    @RequestMapping(method = RequestMethod.PUT)
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public Idea updateIdea(@RequestBody IdeaDto ideaDto, HttpServletResponse response) throws RuntimeException {
        return ideaService.updateIdea(ideaDto);
    }

    @ApiOperation("Deletes an existing Idea")
    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    public void deleteUser(@PathVariable("id") String id) throws RuntimeException {
        ideaService.deleteIdea(id);
    }

    @ApiOperation("Add a new Image")
    @RequestMapping(value = "/image/{ideaId}", method = RequestMethod.POST)
    public Idea addImage(@RequestBody ImageDto imageDto, @PathVariable("ideaId") String ideaId) throws RuntimeException {
        return ideaService.addImage(imageDto, ideaId);
    }

    @ApiOperation("Add a new Video")
    @RequestMapping(value = "/video/{ideaId}", method = RequestMethod.POST)
    public Idea addVideo(@RequestBody VideoDto videoDtoeo, @PathVariable("ideaId") String ideaId) throws RuntimeException {
        return ideaService.addVideo(videoDtoeo, ideaId);
    }

    @ApiOperation("Give a like to the idea")
    @RequestMapping(value = "/like/{ideaId}", method = RequestMethod.POST)
    public Idea giveAlike(@RequestBody LikeDto likeDto, @PathVariable("ideaId") String ideaId) throws RuntimeException {
        return ideaService.giveALike(likeDto, ideaId);
    }

    @ApiOperation("Post a commentary")
    @RequestMapping(value = "/commentary/{ideaId}", method = RequestMethod.POST)
    public Idea postAcommentary(@RequestBody CommentaryDto commentaryDto, @PathVariable("ideaId") String ideaId) throws RuntimeException {
        return ideaService.postCommentary(commentaryDto, ideaId);
    }

    @ApiOperation("Get the total amount of like of a given idea")
    @RequestMapping(value = "/like/{ideaId}", method = RequestMethod.GET)
    public int postAcommentary(@PathVariable("ideaId") String ideaId) throws RuntimeException {
        return ideaService.getTotalAmountLikes(ideaId);
    }
}
