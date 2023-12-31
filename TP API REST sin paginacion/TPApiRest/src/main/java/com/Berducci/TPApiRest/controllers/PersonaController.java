package com.Berducci.TPApiRest.controllers;

import com.Berducci.TPApiRest.entities.Persona;
import com.Berducci.TPApiRest.services.PersonaServiceImpl;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping(path = "api/v1/personas")
public class PersonaController extends BaseControllerImpl <Persona, PersonaServiceImpl>{
}
