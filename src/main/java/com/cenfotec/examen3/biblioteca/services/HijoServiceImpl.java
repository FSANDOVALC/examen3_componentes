package com.cenfotec.examen3.biblioteca.services;

import com.cenfotec.examen3.biblioteca.domains.Hijo;
import com.cenfotec.examen3.biblioteca.repositories.HijoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class HijoServiceImpl implements HijoService{

    @Autowired
    HijoRepository hijoRepository;

    @Override
    public List<Hijo> getAll() {
        return null;
    }

    @Override
    public Optional<Hijo> findById(String id) {
        return Optional.empty();
    }

    @Override
    public Optional<Hijo> save(Hijo hijo) {
        return Optional.empty();
    }

    @Override
    public Optional<Hijo> update(Hijo hijo) {
        return Optional.empty();
    }

    @Override
    public boolean delete(String id) {
        return false;
    }
}
