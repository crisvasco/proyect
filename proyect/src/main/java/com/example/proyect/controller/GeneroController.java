package com.example.proyect.controller;

import com.example.proyect.model.Genero;
import com.example.proyect.service.GeneroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1/genero")
public class GeneroController {

    @Autowired
    private GeneroService generoService;

    // GET
    @GetMapping
    public List<Genero> listarGeneros(){
        return generoService.getAllGeneros();
    }

    // POST
    @PostMapping
    public Genero crearGenero(@RequestBody Genero genero){
        return generoService.createGenero(genero);
    }

    // PUT
    @PutMapping("editar/{id}")
    public Genero actualizarGenero(@RequestBody Genero genero, @PathVariable Long id){
        genero.setIdGenero(id);
        return generoService.updateGenero(genero);
    }

    // DELETE
    @DeleteMapping("eliminar/{id}")
    public void eliminarGenero(@PathVariable Long id){
        generoService.deleteGeneroById(id);
    }
}