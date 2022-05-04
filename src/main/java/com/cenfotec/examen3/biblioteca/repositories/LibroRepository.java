package com.cenfotec.examen3.biblioteca.repositories;

import com.cenfotec.examen3.biblioteca.domains.Libro;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LibroRepository extends JpaRepository<Libro, Integer> {
}
