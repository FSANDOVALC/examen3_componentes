package com.cenfotec.examen3.biblioteca.services;

import com.cenfotec.examen3.biblioteca.domains.Hijo;

import java.util.List;
import java.util.Optional;

public interface HijoService {
    public List<Hijo> getAll();
    public Optional<Hijo> findById(String id);
    public Optional<Hijo> save(Hijo hijo);
    public Optional<Hijo> update(Hijo hijo);
    public boolean delete(String id);
}
