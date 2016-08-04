package com.everis.ideaton.controller;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.RestController;

@ControllerAdvice(annotations=RestController.class)
public class RestExceptionHandler {
    // TODO: 04-08-2016 Desde acá se pueden capturar las expcepciones lanzadas o propagadas hasta
    // las clases anotadas como RestController. Pienso crear algunas exceptions customizadas o usar las
    // existentes generadas en la capa de repository. Lo importante es capturar la exception y devolver un mensaje
    // customizado. Usar clases ErrorResource y ErrorDescription para la respuesta. Para las validaciones de los request
    // a los endpoints hibernate-validator y @Valid
}
