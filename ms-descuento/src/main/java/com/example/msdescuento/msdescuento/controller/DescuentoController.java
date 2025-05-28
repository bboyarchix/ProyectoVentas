package com.example.msdescuento.msdescuento.controller;

import com.example.msdescuento.msdescuento.entity.Descuento;
import com.example.msdescuento.msdescuento.service.DescuentoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/descuento")
public class DescuentoController {

    @Autowired
    private DescuentoService descuentoService;

    // Listar todos los descuentos
    @GetMapping
    public ResponseEntity<List<Descuento>> list() {
        return ResponseEntity.ok().body(descuentoService.list());
    }

    // Guardar un nuevo descuento
    @PostMapping
    public ResponseEntity<Descuento> save(@RequestBody Descuento descuento) {
        return ResponseEntity.ok(descuentoService.save(descuento));
    }

    // Actualizar un descuento existente
    @PutMapping
    public ResponseEntity<Descuento> update(@RequestBody Descuento descuento) {
        return ResponseEntity.ok(descuentoService.update(descuento));
    }

    // Obtener descuento por ID
    @GetMapping("/{id}")
    public ResponseEntity<Descuento> listById(@PathVariable Integer id) {
        Optional<Descuento> descuento = descuentoService.findById(id);
        return descuento.map(ResponseEntity::ok)
                .orElseGet(() -> ResponseEntity.notFound().build());
    }

    // Eliminar descuento por ID
    @DeleteMapping("/{id}")
    public String deleteById(@PathVariable Integer id) {
        descuentoService.deleteById(id);
        return "Descuento eliminado correctamente";
    }
}
