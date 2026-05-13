package com.example.perfulandiaSPA.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.example.perfulandiaSPA.model.Pedido;

@Repository
public class PedidoRepository {

    //creacion de lista para guardar los pedidos
    private List<Pedido> listaPedidos = new ArrayList<>();
    
    //metodo para retornar todos los pedidos
    public List<Pedido> obtenerPedidos(){
        return listaPedidos;
    }

    //Buscar pedido por su ID
    public Pedido buscarPorId(int id){
        for (Pedido pedido : listaPedidos){
            if (pedido.getIdPedido() == id){
                return pedido;
            }
        }
        return null;
    }

    //Guardar registo en Pedido
    public Pedido guardarPedido(Pedido pedido) {
        listaPedidos.add(pedido);
        return pedido;
    }

    //Actualizar un pedido 
    public Pedido actualizarPedido (Pedido pedido){
        int id = 0;
        int idPosicion = 0;

        for (int i = 0; i < listaPedidos.size();i++){
            if (listaPedidos.get(i).getIdPedido() == pedido.getIdPedido()){
                id = pedido.getIdPedido();
                idPosicion =i;
            }
        }

        Pedido pedido2 = new Pedido();
        pedido2.setIdPedido(id);
        pedido2.setRutCliente(pedido.getRutCliente());
        pedido2.setIdPerfume(pedido.getIdPerfume());
        pedido2.setCantidadPerfume(pedido.getCantidadPerfume());
        pedido2.setPrecioTotal(pedido.getPrecioTotal());
        pedido2.setDireccionPedido(pedido.getDireccionPedido());

        listaPedidos.set(idPosicion, pedido2);
        return pedido2;
    }

    //Eliminar pedido 
    public void eliminarPedido(int id){
        listaPedidos.removeIf(x -> x.getIdPedido() == id);
    }

    
}
