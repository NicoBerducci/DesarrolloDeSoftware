package com.NicoBerducci.TrabajoPractico1.entidades;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.Date;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Factura implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long IdFactura;

    private int numero;

    private Date fecha;

    private double descuento;

    public enum FormaPago {
        EFECTIVO,
        ETC
    }

    @Enumerated
    private FormaPago formaPago;

    private int total;
}
