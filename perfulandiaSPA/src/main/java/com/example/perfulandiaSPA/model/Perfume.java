package com.example.perfulandiaSPA.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "PERFUME")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Perfume {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_perfume")
    @SequenceGenerator(name = "seq_perfume", sequenceName = "SEQ_PERFUME", allocationSize = 1)
    private Integer id;

    private String nombre;
    private String marca;
    private double precio;

    @Column(name = "CATEGORIA_ID")
    private Integer categoriaId;
}