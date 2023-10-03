package com.Berducci.TPApiRest.services;

import com.Berducci.TPApiRest.entities.Autor;
import com.Berducci.TPApiRest.repositories.AutorRepository;
import com.Berducci.TPApiRest.repositories.BaseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AutorServiceImpl extends BaseServiceImpl <Autor, Long> implements AutorService{

    @Autowired
    private AutorRepository autorRepositoryRepository;

    public AutorServiceImpl(BaseRepository<Autor, Long> baseRepository, AutorRepository autorRepositoryRepository) {
        super(baseRepository);
        this.autorRepositoryRepository = autorRepositoryRepository;
    }
}
