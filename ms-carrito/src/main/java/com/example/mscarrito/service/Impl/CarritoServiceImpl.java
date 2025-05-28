package com.example.mscarrito.service.Impl;

import com.example.mscarrito.entity.Carrito;
import com.example.mscarrito.repository.CarritoRepository;
import com.example.mscarrito.service.CarritoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CarritoServiceImpl implements CarritoService {

    @Autowired
    private CarritoRepository carritoRepository;

    @Override
    public List<Carrito> list() {
        return carritoRepository.findAll();
    }

    @Override
    public Carrito save(Carrito carrito) {
        return carritoRepository.save(carrito);
    }

    @Override
    public Carrito update(Carrito carrito) {
        return carritoRepository.save(carrito);
    }

    @Override
    public Optional<Carrito> findById(Integer id) {
        return carritoRepository.findById(id);
    }

    @Override
    public void deleteById(Integer id) {
        carritoRepository.deleteById(id);
    }
}
