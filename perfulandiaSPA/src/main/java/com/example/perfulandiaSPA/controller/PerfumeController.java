package com.example.perfulandiaSPA.controller;

import com.example.perfulandiaSPA.model.Perfume;
import com.example.perfulandiaSPA.service.PerfumeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@CrossOrigin(origins = "*") 
@RestController
@RequestMapping("/api/v1/perfumes")
public class PerfumeController {
    
    @Autowired
    private PerfumeService perfumeService;

    @GetMapping
    public List<Perfume> getAll() { return perfumeService.listarTodos(); }

    @PostMapping
    public Perfume create(@RequestBody Perfume perfume) { return perfumeService.crear(perfume); }

    @GetMapping("/{id}")
    public Perfume getById(@PathVariable int id) { return perfumeService.buscarPorId(id); }

    @PutMapping("/{id}")
    public Perfume update(@PathVariable int id, @RequestBody Perfume perfume) {
        perfume.setId(id);
        return perfumeService.actualizar(perfume);
    }

    @DeleteMapping("/{id}")
    public String delete(@PathVariable int id) { return perfumeService.borrar(id); }
}
