package com.Berducci.TPApiRest.controllers;

import com.Berducci.TPApiRest.entities.Localidad;
import com.Berducci.TPApiRest.services.LocalidadServiceImpl;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping(path = "api/v1/localidades")
public class LocalidadController extends BaseControllerImpl <Localidad, LocalidadServiceImpl> {
}
