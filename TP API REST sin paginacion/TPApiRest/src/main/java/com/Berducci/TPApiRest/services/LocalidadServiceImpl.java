package com.Berducci.TPApiRest.services;

import com.Berducci.TPApiRest.entities.Localidad;
import com.Berducci.TPApiRest.repositories.BaseRepository;
import com.Berducci.TPApiRest.repositories.LocalidadRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LocalidadServiceImpl extends BaseServiceImpl <Localidad, Long> implements LocalidadService {

    @Autowired
    private LocalidadRepository localidadRepositoryRepository;

    public LocalidadServiceImpl(BaseRepository<Localidad, Long> baseRepository, LocalidadRepository localidadRepositoryRepository) {
        super(baseRepository);
        this.localidadRepositoryRepository = localidadRepositoryRepository;
    }
}
