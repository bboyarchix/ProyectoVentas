package com.example.mscarrito.controller;

import com.example.mscarrito.entity.Carrito;
import com.example.mscarrito.service.CarritoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/carrito")
public class CarritoController {
    @Autowired
    private CarritoService carritoService;

    @GetMapping
    public ResponseEntity<List<Carrito>> list() {
        return ResponseEntity.ok().body(carritoService.list());
    }

    @PostMapping()
    public ResponseEntity<Carrito> save(@RequestBody Carrito carrito) {
        return ResponseEntity.ok(carritoService.save(carrito));
    }

    @PutMapping()
    public ResponseEntity<Carrito> update(@RequestBody Carrito carrito) {
        return ResponseEntity.ok(carritoService.update(carrito));
    }

    @GetMapping("/{id}")
    public ResponseEntity<Carrito> listById(@PathVariable(required = true) Integer id) {
        return ResponseEntity.ok().body(carritoService.findById(id).get());
    }

    @DeleteMapping("/{id}")
    public String deleteById(@PathVariable(required = true) Integer id) {
        carritoService.deleteById(id);
        return "Eliminación Correcta";
    }
}
