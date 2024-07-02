package com.example.proyect.service;

import com.example.proyect.model.Genero;
import com.example.proyect.repository.GeneroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GeneroService {

    @Autowired
    private GeneroRepository generoRepository;

    //Mostrar géneros
    public List<Genero> getAllGeneros() {
        return generoRepository.findAll();
    }

    //Crear género
    public Genero createGenero(Genero genero) {
        return generoRepository.save(genero);
    }

    //Editar género
    public Genero updateGenero(Genero genero) {
        return generoRepository.save(genero);
    }

    //Eliminar género
    public void deleteGeneroById(Long id) {
        generoRepository.deleteById(id);
    }
}
