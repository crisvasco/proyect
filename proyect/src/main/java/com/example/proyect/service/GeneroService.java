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

    // Mostrar todos los géneros
    public List<Genero> getAllGeneros(){
        return generoRepository.findAll();
    }

    // Crear un género
    public Genero createGenero(Genero genero){
        return generoRepository.save(genero);
    }

    // Actualizar un género
    public Genero updateGenero(Genero genero){
        // El género ya viene con el idGenero insertado desde el controlador.
        return generoRepository.save(genero);
    }

    // Eliminar un género por su ID
    public void deleteGeneroById(Long id){
        generoRepository.deleteById(id);
    }
}