package com.NicoBerducci.TrabajoPractico1.entidades;

import com.NicoBerducci.TrabajoPractico1.enums.Estado;
import com.NicoBerducci.TrabajoPractico1.enums.TipoEnvio;
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
public class Pedido extends BaseEntidad{

    @Enumerated(EnumType.STRING)
    private Estado estado;

    private Date fecha;

    @Enumerated(EnumType.STRING)
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
        System.out.println("------------------------------------------------------");
        System.out.println("Se encontró el siguiente detalle de pedido: " + getId());
        System.out.println("------------------------------------------------------");
        for (DetallePedido detallePedido : detallePedidos) {
            System.out.println("Cantidad: " + detallePedido.getCantidad());
            System.out.println("Subtotal: " + detallePedido.getSubtotal());
        }

    }
}
