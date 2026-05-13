package com.example.perfulandiaSPA.controller;

import com.example.perfulandiaSPA.model.Categoria;
import com.example.perfulandiaSPA.service.CategoriaService;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/api/v1/categorias")
public class CategoriaController {
    
    @Autowired
    private CategoriaService categoriaService;

    @GetMapping
    public List<Categoria> listarCategorias() {
        return categoriaService.getCategorias();
    }

    @PostMapping
    public Categoria agregarCategoria(@RequestBody Categoria categoria) {
        return categoriaService.saveCategoria(categoria);
    }

    @GetMapping("{id}")
    public Categoria buscarCategoria(@PathVariable int id){
        return categoriaService.getCategoria(id);
    }

    @PutMapping("{id}")
    public Categoria actualizarCategoria(@PathVariable int id, @RequestBody Categoria categoria){
        return categoriaService.updateCategoria(categoria);
    }

    @DeleteMapping("{id}")
    public String eliminarCategoria(@PathVariable int id) {
        return categoriaService.deleteCategoria(id);
    }

}
