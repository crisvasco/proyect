package com.example.proyect.service;

import com.example.proyect.model.Resena;
import com.example.proyect.repository.ResenaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ResenaService {

    @Autowired
    private ResenaRepository resenaRepository;

    // Mostrar todas las reseñas
    public List<Resena> getAllResenas(){
        return resenaRepository.findAll();
    }

    // Crear una reseña
    public Resena createResena(Resena resena){
        return resenaRepository.save(resena);
    }

    // Actualizar una reseña
    public Resena updateResena(Resena resena){
        // La reseña ya viene con el idResena insertado desde el controlador.
        return resenaRepository.save(resena);
    }

    // Eliminar una reseña por su ID
    public void deleteResenaById(Long id){
        resenaRepository.deleteById(id);
    }
}
