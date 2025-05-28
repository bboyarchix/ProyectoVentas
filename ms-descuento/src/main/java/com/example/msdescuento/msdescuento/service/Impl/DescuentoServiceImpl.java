package com.example.msdescuento.msdescuento.service.Impl;

import com.example.msdescuento.msdescuento.entity.Descuento;
import com.example.msdescuento.msdescuento.repository.DescuentoRepository;
import com.example.msdescuento.msdescuento.service.DescuentoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class DescuentoServiceImpl implements DescuentoService {

    @Autowired
    private DescuentoRepository descuentoRepository;

    @Override
    public List<Descuento> list() {
        return descuentoRepository.findAll();
    }

    @Override
    public Descuento save(Descuento descuento) {
        return descuentoRepository.save(descuento);
    }

    @Override
    public Descuento update(Descuento descuento) {
        return descuentoRepository.save(descuento);
    }

    @Override
    public Optional<Descuento> findById(Integer id) {
        return descuentoRepository.findById(id);
    }

    @Override
    public void deleteById(Integer id) {
        descuentoRepository.deleteById(id);
    }
}
