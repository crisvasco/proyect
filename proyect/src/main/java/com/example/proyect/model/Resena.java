package com.example.proyect.model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class Resena {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idResena;

    private String comentario;
    private int calificacion;

    @ManyToOne
    @JoinColumn(name = "libro_id")
    private Libro libro;
    // Getters y setters
}
