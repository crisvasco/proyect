package com.example.proyect.model;

import jakarta.persistence.*;
import lombok.Data;
import java.util.List;

@Entity
@Data
public class Genero {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idGenero;

    private String nombre;

    @OneToMany(mappedBy = "genero", cascade = CascadeType.ALL)
    private List<Libro> libros;
}
