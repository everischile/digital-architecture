package com.everis.ideaton.controller;

import com.everis.ideaton.domain.Image;
import com.everis.ideaton.service.ImageService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletResponse;
import java.math.BigInteger;
import java.util.List;

@RequestMapping("/image")
@RestController
@Api(value = "image", description = "image operations")
public class ImageController {

    @Autowired
    private ImageService imageService;

    @ApiOperation("Returns all the images")
    @RequestMapping(method = RequestMethod.GET)
    public List<Image> getImages() throws RuntimeException{
        return imageService.getAllImages();
    }

    @ApiOperation("Find Image by Id")
    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public Image getImageById(@PathVariable("id") BigInteger id) throws RuntimeException{
        return imageService.getImageById(id);
    }

    @ApiOperation("Add a new Image")
    @ResponseStatus(HttpStatus.CREATED)
    @RequestMapping(method = RequestMethod.POST)
    public Image saveImage(@RequestBody Image image, HttpServletResponse response) throws RuntimeException {
        return imageService.saveImage(image);
    }

    @ApiOperation("Updates an Image")
    @RequestMapping(method = RequestMethod.PUT)
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public Image updateImage(@RequestBody Image image, HttpServletResponse response) throws RuntimeException {
        return imageService.updateImage(image);
    }

    @ApiOperation("Deletes an existing Image")
    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    public void deleteImage(@PathVariable("id") BigInteger id) throws RuntimeException {
        imageService.deleteImage(id);
    }
}
