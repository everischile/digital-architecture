package com.everis.ideaton.controller;

import com.everis.ideaton.domain.Image;
import com.everis.ideaton.service.ImageService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequestMapping("/image")
@RestController
@Api(value = "image", description = "image operations")
@Slf4j
public class ImageController {

    private final ImageService imageService;

    @Autowired
    public ImageController(ImageService imageService) {
        this.imageService = imageService;
    }

    @ApiOperation("Returns all the images")
    @RequestMapping(method = RequestMethod.GET)
    public List<Image> getImages() throws RuntimeException{
        return imageService.getAllImages();
    }

    @ApiOperation("Find Image by Id")
    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public Image getImageById(@PathVariable("id") String id) throws RuntimeException{
        return imageService.getImageById(id);
    }

    @ApiOperation("Deletes an existing Image")
    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    public void deleteImage(@PathVariable("id") String id) throws RuntimeException {
        imageService.deleteImage(id);
    }
}
