package com.example.msdescuento.msdescuento.service;

import com.example.msdescuento.msdescuento.entity.Descuento;

import java.util.List;
import java.util.Optional;

public interface DescuentoService {
    public List<Descuento> list();
    public Descuento save(Descuento descuento);
    public Descuento update(Descuento descuento);
    public Optional<Descuento> findById(Integer id);
    public void deleteById(Integer id);
}
