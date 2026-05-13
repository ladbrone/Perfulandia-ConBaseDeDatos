package com.example.perfulandiaSPA.service;

import com.example.perfulandiaSPA.model.Perfume;
import com.example.perfulandiaSPA.repository.PerfumeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class PerfumeService {
    @Autowired
    private PerfumeRepository perfumeRepository;

    public List<Perfume> listarTodos() { return perfumeRepository.obtenerTodos(); }
    public Perfume buscarPorId(int id) { return perfumeRepository.buscarPorId(id); }
    public Perfume crear(Perfume p) { return perfumeRepository.guardar(p); }
    public Perfume actualizar(Perfume p) { return perfumeRepository.actualizar(p); }
    public String borrar(int id) {
        perfumeRepository.eliminar(id);
        return "Perfume eliminado correctamente <3";
    }
}