package com.example.proyect.model;

import jakarta.persistence.*;
import lombok.Data;
import java.util.ArrayList;
import java.util.List;

@Entity
@Data
public class Autor {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idAutor;

    private String nombre;
    private String apellido;
    private String nacionalidad;
    private String fechaNacimiento;

    @ManyToMany(mappedBy = "autores")
    private List<Libro> libros = new ArrayList<>();
}
