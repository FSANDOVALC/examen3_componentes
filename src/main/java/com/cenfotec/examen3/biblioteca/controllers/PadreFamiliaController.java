package com.cenfotec.examen3.biblioteca.controllers;

import com.cenfotec.examen3.biblioteca.domains.PadreFamilia;
import com.cenfotec.examen3.biblioteca.services.PadreFamiliaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping({"/padres"})
public class PadreFamiliaController {

    @Autowired
    PadreFamiliaService padreFamiliaService;

    @GetMapping
    public List getAll(){
        return padreFamiliaService.getAll();
    }

    @GetMapping(path = {"/{id}"})
    public ResponseEntity<PadreFamilia> findById(@PathVariable long id){
        Optional<PadreFamilia> result = padreFamiliaService.findById(id);
        if (result.isPresent()){
            return ResponseEntity.ok().body(result.get());
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @PostMapping
    public PadreFamilia create(@RequestBody PadreFamilia padreFamilia){
        return padreFamiliaService.save(padreFamilia).get();
    }

    @PutMapping(value="/{id}")
    public ResponseEntity<PadreFamilia> update(@PathVariable("id") long id,
                                          @RequestBody PadreFamilia padreFamilia){
        padreFamilia.setId(id);
        Optional<PadreFamilia> result = padreFamiliaService.update(padreFamilia);
        if (result.isPresent()){
            return ResponseEntity.ok().body(result.get());
        }else {
            return ResponseEntity.notFound().build();
        }
    }

    @DeleteMapping(value="/{id}")
    public ResponseEntity<?> delete(@PathVariable("id") long id) {
        if (padreFamiliaService.delete(id)) {
            return ResponseEntity.ok().build();
        } else {
            return ResponseEntity.notFound().build();
        }
    }

}
