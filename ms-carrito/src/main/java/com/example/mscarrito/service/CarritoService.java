package com.example.mscarrito.service;

import com.example.mscarrito.entity.Carrito;

import java.util.List;
import java.util.Optional;

public interface CarritoService {
    public List<Carrito> list();
    public Carrito save(Carrito carrito);
    public Carrito update(Carrito carrito);
    public Optional<Carrito> findById(Integer id);
    public void deleteById(Integer id);
}
