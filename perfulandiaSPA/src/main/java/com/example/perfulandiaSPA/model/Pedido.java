package com.example.perfulandiaSPA.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "PEDIDO")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Pedido {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_pedido")
    @SequenceGenerator(name = "seq_pedido", sequenceName = "SEQ_PEDIDO", allocationSize = 1)
    @Column(name = "ID_PEDIDO")
    private int idPedido;

    @Column(name = "RUT_CLIENTE")
    private String rutCliente;

    @Column(name = "ID_PERFUME")
    private String idPerfume;

    @Column(name = "CANTIDAD_PERFUME")
    private int cantidadPerfume;

    @Column(name = "PRECIO_TOTAL")
    private String precioTotal;

    @Column(name = "DIRECCION_PEDIDO")
    private String direccionPedido;
}