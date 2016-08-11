package com.everis.ideaton.controller;

import com.everis.ideaton.service.types.TypeService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Slf4j
@RequestMapping("/types")
@RestController
@Api(value = "type", description = "types operations")
public class EnumController {

    private final TypeService typeService;

    @Autowired
    public EnumController(TypeService typeService) {
        this.typeService = typeService;
    }

    @ApiOperation("Returns all social platform types")
    @RequestMapping(value = "/socialPlatform", method = RequestMethod.GET)
    public List<String> getSocialPlatformTypes() throws RuntimeException{
        return typeService.getSocialPlatformTypes();
    }

    @ApiOperation("Returns all state types")
    @RequestMapping(value = "/state}", method = RequestMethod.GET)
    public List<String> getStateTypes() throws RuntimeException{
        return typeService.getStateTypeTypes();
    }

    @ApiOperation("Returns all category types")
    @RequestMapping(value = "/category", method = RequestMethod.GET)
    public List<String> getCategoryTypes() throws RuntimeException{
        return typeService.getCategoryTypes();
    }

    @ApiOperation("Returns all role types")
    @RequestMapping(value = "/role", method = RequestMethod.GET)
    public List<String> getRoleTypes() throws RuntimeException{
        return typeService.getRoleTypes();
    }
}
