package com.Berducci.TPApiRest.repositories;

import com.Berducci.TPApiRest.entities.Persona;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonaRepository extends BaseRepository <Persona, Long>{
}