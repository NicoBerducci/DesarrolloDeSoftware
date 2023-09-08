package com.NicoBerducci.TrabajoPractico1.entidades;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Pedido implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long IdPedido;

    public enum Estado{
        Iniciado,
        Preparacion,
        Entregado
    }
    @Enumerated
    private Estado estado;

    private Date fecha;

    public enum TipoEnvio{
        Delivery,
        Retira
    }
    @Enumerated
    private TipoEnvio tipoEnvio;

    private double total;

    @OneToOne(cascade = CascadeType.ALL, orphanRemoval = true)
    @JoinColumn(name = "IdFactura", nullable = true)
    private Factura factura;

    @OneToMany(cascade = CascadeType.ALL, orphanRemoval = true,fetch = FetchType.EAGER)
    @JoinColumn(name = "IdPedido")
    @Builder.Default
    private List<DetallePedido> detallePedidos = new ArrayList<>();

    public void agregarDetallePedido(DetallePedido deta){

        detallePedidos.add(deta);

    }
    public void mostrarDetallePedidos() {
        System.out.println("Detalles de pedidos con id: " + IdPedido);
        for (DetallePedido detallePedido : detallePedidos) {
            System.out.println("Cantidad: " + detallePedido.getCantidad());
            System.out.println("Subtotal: " + detallePedido.getSubtotal());
        }

    }
}
