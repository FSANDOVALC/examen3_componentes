package com.cenfotec.examen3.biblioteca.domains;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
public class PadreFamilia {

    @Id
    @Column(name = "ID", nullable = false)
    @GeneratedValue(strategy = GenerationType.AUTO)
    private String id;

    private String nombre;
    private String cedula;
    private String direccion;
    private String telefonoPrimario;
    private String telefonoSecundario;

    @OneToMany(targetEntity = Hijo.class, cascade = CascadeType.ALL)
    @JoinColumn(name = "ph_fk", referencedColumnName = "id")
    private List<Hijo> hijosList;
}
