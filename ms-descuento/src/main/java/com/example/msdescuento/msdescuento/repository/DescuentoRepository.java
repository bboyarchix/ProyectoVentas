package com.example.msdescuento.msdescuento.repository;

import com.example.msdescuento.msdescuento.entity.Descuento;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DescuentoRepository extends JpaRepository<Descuento, Integer> {
}
