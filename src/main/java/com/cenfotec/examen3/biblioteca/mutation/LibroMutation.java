package com.cenfotec.examen3.biblioteca.mutation;

import com.cenfotec.examen3.biblioteca.domains.Libro;
import com.cenfotec.examen3.biblioteca.services.LibroService;
import com.coxautodev.graphql.tools.GraphQLMutationResolver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class LibroMutation implements GraphQLMutationResolver {

    @Autowired
    private LibroService libroService;

    public Libro createLibro(String nombre, String autor) {
        return this.libroService.createLibro(nombre, autor);
    }
}
