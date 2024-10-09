package com.dantas.api_db_poetas.service.impl;

import com.dantas.api_db_poetas.model.Autor;
import com.dantas.api_db_poetas.repository.AutorRepository;
import com.dantas.api_db_poetas.service.AutorService;
import org.springframework.stereotype.Service;

import java.util.NoSuchElementException;

@Service
public class AutorServiceImpl implements AutorService {

    private final AutorRepository autorRepository;

    public AutorServiceImpl(AutorRepository autorRepository) {
        this.autorRepository = autorRepository;
    }

    @Override
    public Autor findById(Long id) {
        return autorRepository.findById(id).orElseThrow(NoSuchElementException::new);
    }



    @Override
    public Autor create(Autor autor) {
        if (autorRepository.existsById(autor.getId())){
            throw new IllegalArgumentException("Este autor já existe!");
        }
        return autorRepository.save(autor);
    }
}
