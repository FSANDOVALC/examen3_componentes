package com.cenfotec.examen3.biblioteca.repositories;

import com.cenfotec.examen3.biblioteca.domains.PadreFamilia;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PadreFamiliaRepository extends JpaRepository<PadreFamilia, Long> {
}
