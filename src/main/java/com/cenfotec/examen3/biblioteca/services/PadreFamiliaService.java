package com.cenfotec.examen3.biblioteca.services;

import com.cenfotec.examen3.biblioteca.domains.PadreFamilia;

import java.util.List;
import java.util.Optional;

public interface PadreFamiliaService {
    public List<PadreFamilia> getAll();
    public Optional<PadreFamilia> findById(String id);
    public Optional<PadreFamilia> save(PadreFamilia padreFamilia);
    public Optional<PadreFamilia> update(PadreFamilia padreFamilia);
    public boolean delete(String id);
}
