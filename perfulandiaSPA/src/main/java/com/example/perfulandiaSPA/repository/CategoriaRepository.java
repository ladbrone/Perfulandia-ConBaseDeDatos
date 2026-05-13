package com.example.perfulandiaSPA.repository;

import com.example.perfulandiaSPA.model.Categoria;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class CategoriaRepository {
    
    //Creación de lista para guardar categorías
    private List<Categoria> listaCategorias = new ArrayList<>();

    //Método para retornar todas las categorías
    public List<Categoria> obtenerCategorias() {
        return listaCategorias;
    }

    // Buscar una categoría por su id
    public Categoria buscarPorId(int id) {
        for (Categoria categoria : listaCategorias) {
            if (categoria.getCategoriaId() == id) {
                return categoria;
            }
        }
        return null;
    }

    //Guardar un registro en categoria
    public Categoria guardar(Categoria categoria) {
        listaCategorias.add(categoria);
        return categoria;
    }

    //Actualizar un registro de una categoría
    public Categoria actualizar(Categoria categoria) {
        int id = 0;
        int idPosicion = 0;

        for (int i = 0; i < listaCategorias.size(); i++) {
            if (listaCategorias.get(i).getCategoriaId() == categoria.getCategoriaId()) {
                id = categoria.getCategoriaId();
                idPosicion = i;
            }
        }

        Categoria categoria1 = new Categoria();
        categoria1.setCategoriaId(id);
        categoria1.setFragancia(categoria.getFragancia());
        categoria1.setGenero(categoria.getGenero());
        categoria1.setTamano(categoria.getTamano());

        listaCategorias.set(idPosicion, categoria1);
        return categoria1;
    }

    //Método para eliminar categorías
    public void eliminar(int id) {
        listaCategorias.removeIf(x -> x.getCategoriaId() == id);
    }

}
