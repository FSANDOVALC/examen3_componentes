package com.cenfotec.examen3.biblioteca.repositories;

import com.cenfotec.examen3.biblioteca.domains.Hijo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface HijoRepository extends JpaRepository<Hijo, Long> {
}
