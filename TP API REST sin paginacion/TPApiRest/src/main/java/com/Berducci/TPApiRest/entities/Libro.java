package com.Berducci.TPApiRest.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.w3c.dom.stylesheets.LinkStyle;

import java.util.Date;
import java.util.List;

@Entity
@Table(name = "Libro")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Libro extends Base {

    @Column(name = "Fecha")
    private Date fecha;

    @Column(name = "Genero")
    private String genero;

    @Column(name = "Paginas")
    private int paginas;

    @Column(name = "Titulo")
    private String titulo;

    @ManyToMany(cascade = CascadeType.REFRESH)
    private List<Autor> autores;
}
