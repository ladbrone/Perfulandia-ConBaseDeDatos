package com.example.perfulandiaSPA.controller;

import com.example.perfulandiaSPA.model.Pedido;
import com.example.perfulandiaSPA.service.PedidoService;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/api/v1/cetegorias")
public class PedidoController {

    @Autowired
    private PedidoService PedidoService;

    @GetMapping
    public List<Pedido> listarPedidos(){
        return PedidoService.getPedidos();
    }

    @PostMapping
    public Pedido agregarPedido(@RequestBody Pedido pedido){
        return PedidoService.savePedido(pedido);
    }

    @GetMapping("{id}")
    public Pedido buscarPedido(@PathVariable int id){
        return PedidoService.getPedidos(id);
    }
 
    @PutMapping("{id}")
    public Pedido actualizarPedido(@PathVariable int id, @RequestBody Pedido pedido){
        return PedidoService.updatePedido(pedido);
    }

    @DeleteMapping("{id}")
    public String eliminarPedido(@PathVariable int id) {
        return PedidoService.deletePedido(id);
    }
}