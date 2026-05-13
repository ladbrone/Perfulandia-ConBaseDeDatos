package com.example.perfulandiaSPA.service;

import com.example.perfulandiaSPA.model.Categoria;
import com.example.perfulandiaSPA.repository.CategoriaRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class CategoriaService {
    
    @Autowired
    private CategoriaRepository categoriaRepository;

    public List<Categoria> getCategorias() {
        return categoriaRepository.obtenerCategorias();
    }

    public Categoria saveCategoria(Categoria categoria) {
        return categoriaRepository.guardar(categoria);
    }

    public Categoria getCategoria(int id) {
        return categoriaRepository.buscarPorId(id);
    }

    public Categoria updateCategoria(Categoria categoria) {
        return categoriaRepository.actualizar(categoria);
    }

    public String deleteCategoria(int id) {
        categoriaRepository.eliminar(id);
        return "producto eliminado";
    }
}
