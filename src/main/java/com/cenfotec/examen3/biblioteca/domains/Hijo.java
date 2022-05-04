package com.cenfotec.examen3.biblioteca.domains;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
public class Hijo {

    @Id
    @Column(name = "ID", nullable = false)
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String nombre;
    private String primerApellido;
    private String segundoApellido;
    private boolean planLectura;
    private boolean planGuarderia;
    private String alergias;
}
