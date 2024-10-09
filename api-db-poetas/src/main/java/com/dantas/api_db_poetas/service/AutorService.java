package com.dantas.api_db_poetas.service;

import com.dantas.api_db_poetas.model.Autor;

public interface AutorService {
    Autor findById(Long id);

    Autor create(Autor autor);
}
