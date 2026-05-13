package com.example.perfulandiaSPA.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.perfulandiaSPA.model.Pedido;
import com.example.perfulandiaSPA.repository.PedidoRepository;

@Service
public class PedidoService {
    @Autowired
    private PedidoRepository pedidoRepository;

    public List<Pedido> getPedidos(){
        return pedidoRepository.obtenerPedidos();
    }

    public Pedido savePedido(Pedido pedido){
        return pedidoRepository.guardarPedido(pedido);
    }

    public Pedido getPedidos(int id) {
        return pedidoRepository.buscarPorId(id);
    }

    public Pedido updatePedido (Pedido pedido){
        return pedidoRepository.actualizarPedido(pedido);
    }

    public String deletePedido(int id){
        pedidoRepository.eliminarPedido(id);
        return "Pedido eliminado";
    }
}
