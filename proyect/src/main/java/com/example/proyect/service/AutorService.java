package com.example.proyect.service;

import com.example.proyect.model.Autor;
import com.example.proyect.repository.AutorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AutorService {

    @Autowired
    private AutorRepository autorRepository;

    // Mostrar autores
    public List<Autor> getAllAutores(){
        return autorRepository.findAll();
    }

    // Crear autor
    public Autor createAutor(Autor autor){
        return autorRepository.save(autor);
    }

    // Editar autor
    public Autor updateAutor(Autor autor){
        // El autor ya viene con el idAutor insertado desde el controlador.
        return autorRepository.save(autor);
    }

    // Eliminar autor
    public void deleteAutorById(Long id){
        autorRepository.deleteById(id);
    }
}