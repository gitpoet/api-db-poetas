package com.dantas.api_db_poetas.controller;

import com.dantas.api_db_poetas.model.Autor;
import com.dantas.api_db_poetas.service.AutorService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;

@RestController
@RequestMapping("/autores")
public class AutorController {
    private final AutorService autorService;

    public AutorController(AutorService autorService) {
        this.autorService = autorService;
    }

    @GetMapping("/{id}")
    public ResponseEntity<Autor> findById(@PathVariable Long id){
        var autor = autorService.findById(id);
        return ResponseEntity.ok(autor);
    }


    @PostMapping
    public ResponseEntity<Autor> create(@RequestBody Autor autor){
        var autorCreado = autorService.create(autor);
        URI location = ServletUriComponentsBuilder.fromCurrentRequest()
                .path("/{id}")
                .buildAndExpand(autorCreado.getId())
                .toUri();
        return ResponseEntity.created(location).body(autorCreado);
    }


}
