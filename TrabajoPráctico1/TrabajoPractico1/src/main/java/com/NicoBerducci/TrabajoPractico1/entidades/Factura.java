package com.NicoBerducci.TrabajoPractico1.entidades;

import com.NicoBerducci.TrabajoPractico1.enums.FormaPago;
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
public class Factura extends BaseEntidad implements Serializable {

    private int numero;

    private Date fecha;

    private double descuento;

    @Enumerated(EnumType.STRING)
    private FormaPago formaPago;

    private int total;
}
