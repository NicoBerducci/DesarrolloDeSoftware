package com.NicoBerducci.TrabajoPractico1.repositorios;

import com.NicoBerducci.TrabajoPractico1.entidades.Rubro;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RubroRepository extends JpaRepository<Rubro,Long> {

}
