package com.NicoBerducci.TrabajoPractico1.repositorios;

import com.NicoBerducci.TrabajoPractico1.entidades.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClienteRepository extends JpaRepository<Cliente,Long> {
}
