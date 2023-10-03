package com.Berducci.TPApiRest.services;

import com.Berducci.TPApiRest.entities.Persona;
import com.Berducci.TPApiRest.repositories.BaseRepository;
import com.Berducci.TPApiRest.repositories.PersonaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PersonaServiceImpl extends BaseServiceImpl<Persona,Long> implements PersonaService{

    @Autowired
    private PersonaRepository personaRepositoryRepository;

    public PersonaServiceImpl(BaseRepository<Persona, Long> baseRepository, PersonaRepository personaRepositoryRepository){
        super(baseRepository);
        this.personaRepositoryRepository = personaRepositoryRepository;
    }
}
