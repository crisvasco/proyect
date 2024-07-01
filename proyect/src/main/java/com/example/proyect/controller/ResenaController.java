package com.example.proyect.controller;

import com.example.proyect.model.Resena;
import com.example.proyect.service.ResenaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1/resena")
public class ResenaController {

    @Autowired
    private ResenaService resenaService;

    // GET
    @GetMapping
    public List<Resena> listarResenas(){
        return resenaService.getAllResenas();
    }

    // POST
    @PostMapping
    public Resena crearResena(@RequestBody Resena resena){
        return resenaService.createResena(resena);
    }

    // PUT
    @PutMapping("editar/{id}")
    public Resena actualizarResena(@RequestBody Resena resena, @PathVariable Long id){
        resena.setIdResena(id);
        return resenaService.updateResena(resena);
    }

    // DELETE
    @DeleteMapping("eliminar/{id}")
    public void eliminarResena(@PathVariable Long id){
        resenaService.deleteResenaById(id);
    }
}