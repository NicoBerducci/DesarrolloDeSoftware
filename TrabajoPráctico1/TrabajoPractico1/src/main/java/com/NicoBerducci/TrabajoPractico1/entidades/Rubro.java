package com.NicoBerducci.TrabajoPractico1.entidades;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Rubro extends BaseEntidad implements Serializable {

    private String denominacion;

    @OneToMany(cascade = CascadeType.ALL, orphanRemoval = true, fetch = FetchType.EAGER)
    @JoinColumn(name = "IdRubro")
    @Builder.Default
    private List<Producto> productos = new ArrayList<>();

    public void agregarProducto(Producto produc) {

        productos.add(produc);

    }

    public void mostrarProductos() {
        System.out.println("Productos con id: " + getId());
        for (Producto producto : productos) {
            System.out.println("Tipo: " + producto.getTipo());
            System.out.println("Tiempo estimado de cocina: " + producto.getTiempoEstimadoCocina());
            System.out.println("Denominación: " + producto.getDenominacion());
            System.out.println("Precio de venta: " + producto.getPrecioVenta());
            System.out.println("Precio de compra: " + producto.getPrecioCompra());
            System.out.println("Stock actual: " + producto.getStockActual());
            System.out.println("Stock mínimo: " + producto.getStockMinimo());
            System.out.println("Unidad de medida: " + producto.getUnidadMedida());
            System.out.println("Receta: " + producto.getReceta());
        }

    }
}
