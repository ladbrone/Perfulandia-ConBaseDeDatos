package com.example.perfulandiaSPA.repository;

import com.example.perfulandiaSPA.model.Perfume;
import org.springframework.stereotype.Repository;
import java.util.ArrayList;
import java.util.List;

@Repository
public class PerfumeRepository {
    private List<Perfume> listaPerfumes = new ArrayList<>();
    private int ultimoId = 0;

    public List<Perfume> obtenerTodos() {
        return listaPerfumes;
    }

    public Perfume buscarPorId(int id) {
        return listaPerfumes.stream()
                .filter(p -> p.getId() == id)
                .findFirst()
                .orElse(null);
    }

    public Perfume guardar(Perfume p) {
        ultimoId++;
        p.setId(ultimoId);
        listaPerfumes.add(p);
        return p;
    }

    public Perfume actualizar(Perfume p) {
        for (int i = 0; i < listaPerfumes.size(); i++) {
            if (listaPerfumes.get(i).getId().equals(p.getId())) {
                listaPerfumes.set(i, p);
                return p;
            }
        }
        return null;
    }

    public void eliminar(int id) {
        listaPerfumes.removeIf(p -> p.getId() == id);
    }
}
