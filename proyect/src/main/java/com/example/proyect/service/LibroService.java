package com.example.proyect.service;

import com.example.proyect.model.Libro;
import com.example.proyect.repository.LibroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LibroService {

    @Autowired
    private LibroRepository libroRepository;

    //Mostrar libros
    public List<Libro> getAllLibros(){
        return libroRepository.findAll();
    }

    //Crear libro
    public Libro createLibro(Libro libro){
        return libroRepository.save(libro);
    }

    //Editar libro
    public Libro updateLibro(Libro libro){
        //El libro ya viene con el idLibro insertado desde el controlador.
        return libroRepository.save(libro);
    }

    //Eliminar libro
    public void deleteLibroById(Long id){
        libroRepository.deleteById(id);
    }
}
