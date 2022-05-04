package com.cenfotec.examen3.biblioteca.services;

import com.cenfotec.examen3.biblioteca.domains.Libro;
import com.cenfotec.examen3.biblioteca.repositories.LibroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class LibroService {

    @Autowired
    LibroRepository libroRepository;
    public List<Libro> getAllLibros(int count) {
        return
                this.libroRepository.findAll().stream().limit(count).collect(Collectors.toList());
    }
    public Optional<Libro> getLibro(int id) {
        return this.libroRepository.findById(id);
    }
    public Libro createLibro(String nombre, String autor) {

        Libro libro = new Libro();
        libro.setNombre(nombre);
        libro.setAutor(autor);
        return this.libroRepository.save(libro);
    }
}
