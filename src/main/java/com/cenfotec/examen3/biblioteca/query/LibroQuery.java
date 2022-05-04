package com.cenfotec.examen3.biblioteca.query;

import com.cenfotec.examen3.biblioteca.domains.Libro;
import com.cenfotec.examen3.biblioteca.services.LibroService;
import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
public class LibroQuery  implements GraphQLQueryResolver {

    @Autowired
    private LibroService vehicleService;
    public List<Libro> getLibros(int count) {
        return this.vehicleService.getAllLibros(count);
    }
    public Optional<Libro> getLibro(int id) {
        return this.vehicleService.getLibro(id);
    }

}
