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
        return padreFamiliaRepository.findAll();
    }

    @Override
    public Optional<PadreFamilia> findById(Long id) {
        return padreFamiliaRepository.findById(id).map(record -> Optional.of(record)).orElse(Optional.empty());
    }

    @Override
    public Optional<PadreFamilia> save(PadreFamilia padreFamilia) {
        return Optional.of(padreFamiliaRepository.save(padreFamilia));
    }

    @Override
    public Optional<PadreFamilia> update(PadreFamilia padreFamilia) {
        Optional<PadreFamilia> record = padreFamiliaRepository.findById(padreFamilia.getId());
        if (record.isPresent()) {
            PadreFamilia data = record.get();
            data.setNombre(padreFamilia.getNombre());
            data.setPrimerApellido(padreFamilia.getPrimerApellido());
            data.setSegundoApellido(padreFamilia.getSegundoApellido());
            data.setCedula(padreFamilia.getCedula());
            data.setDireccion(padreFamilia.getDireccion());
            data.setTelefonoPrimario(padreFamilia.getTelefonoPrimario());
            data.setTelefonoSecundario(padreFamilia.getTelefonoSecundario());
            data.setHijosList(padreFamilia.getHijosList());
            return Optional.of(padreFamiliaRepository.save(data));
        }
        return Optional.empty();
    }

    @Override
    public boolean delete(Long id) {
        Optional<PadreFamilia> result = padreFamiliaRepository.findById(id);
        if (result.isPresent()){
            padreFamiliaRepository.deleteById(id);
            return true;
        }
        return false;
    }
}
