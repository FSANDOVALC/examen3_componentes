package com.cenfotec.examen3.biblioteca.services;

import com.cenfotec.examen3.biblioteca.domains.PadreFamilia;
import com.cenfotec.examen3.biblioteca.repositories.PadreFamiliaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PadreFamiliaImpl implements PadreFamiliaService{

    @Autowired
    PadreFamiliaRepository padreFamiliaRepository;

    @Override
    public List<PadreFamilia> getAll() {
        return null;
    }

    @Override
    public Optional<PadreFamilia> findById(Long id) {
        return Optional.empty();
    }

    @Override
    public Optional<PadreFamilia> save(PadreFamilia padreFamilia) {
        return Optional.empty();
    }

    @Override
    public Optional<PadreFamilia> update(PadreFamilia padreFamilia) {
        return Optional.empty();
    }

    @Override
    public boolean delete(Long id) {
        return false;
    }
}
