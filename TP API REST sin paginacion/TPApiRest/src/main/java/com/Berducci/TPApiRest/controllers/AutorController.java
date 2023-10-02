package com.Berducci.TPApiRest.controllers;

import com.Berducci.TPApiRest.entities.Autor;
import com.Berducci.TPApiRest.services.AutorServiceImpl;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping(path = "api/v1/autores")
public class AutorController extends BaseControllerImpl <Autor, AutorServiceImpl>{
}
