package com.example.proyect.controller;

import com.example.proyect.model.Libro;
import com.example.proyect.service.LibroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1/libro")
public class LibroController {

    @Autowired
    private LibroService libroService;

    // GET
    @GetMapping
    public List<Libro> listarLibros(){
        return libroService.getAllLibros();
    }

    // POST
    @PostMapping
    public Libro crearLibro(@RequestBody Libro libro){
        return libroService.createLibro(libro);
    }

    // PUT
    @PutMapping("editar/{id}")
    public Libro actualizarLibro(@RequestBody Libro libro, @PathVariable Long id){
        libro.setIdLibro(id);
        return libroService.updateLibro(libro);
    }

    // DELETE
    @DeleteMapping("eliminar/{id}")
    public void eliminarLibro(@PathVariable Long id){
        libroService.deleteLibroById(id);
    }
}