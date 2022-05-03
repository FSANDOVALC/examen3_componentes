package com.cenfotec.examen3.biblioteca.repositories;

import com.cenfotec.examen3.biblioteca.domains.PadreFamilia;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PadreFamiliaRepository extends JpaRepository<PadreFamilia, String> {
}
