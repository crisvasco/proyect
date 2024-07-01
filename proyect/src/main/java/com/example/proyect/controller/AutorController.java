package com.example.proyect.controller;

import com.example.proyect.model.Autor;
import com.example.proyect.service.AutorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1/autor")
public class AutorController {

    @Autowired
    private AutorService autorService;

    // GET
    @GetMapping
    public List<Autor> listarAutores(){
        return autorService.getAllAutores();
    }

    // POST
    @PostMapping
    public Autor crearAutor(@RequestBody Autor autor){
        return autorService.createAutor(autor);
    }

    // PUT
    @PutMapping("editar/{id}")
    public Autor actualizarAutor(@RequestBody Autor autor, @PathVariable Long id){
        autor.setIdAutor(id);
        return autorService.updateAutor(autor);
    }

    // DELETE
    @DeleteMapping("eliminar/{id}")
    public void eliminarAutor(@PathVariable Long id){
        autorService.deleteAutorById(id);
    }
}