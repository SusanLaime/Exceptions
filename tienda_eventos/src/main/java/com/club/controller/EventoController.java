package com.club.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.club.model.EventoModel;
import com.club.service.EventoService;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/eventos")
public class EventoController {

    @Autowired
    private EventoService eventoService;

    @GetMapping
    public List<EventoModel> listarEventos() {
        return eventoService.listarEventos();
    }

    @GetMapping("/{id}")
    public ResponseEntity<EventoModel> obtenerEvento(@PathVariable Long id) {
        Optional<EventoModel> evento = eventoService.obtenerEventoPorId(id);
        if (evento.isPresent()) {
            return ResponseEntity.ok(evento.get());
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @PostMapping("/eventos")
    public EventoModel crearEvento(@RequestBody EventoModel evento) {
        return eventoService.crearEvento(evento);
    }
    public EventoModel guardarEvento(@RequestBody EventoModel evento) {
        return eventoService.guardarEvento(evento);
    }

    @PutMapping("/{id}")
    public ResponseEntity<EventoModel> actualizarEvento(@PathVariable Long id, @RequestBody EventoModel evento) {
        EventoModel eventoActualizado = eventoService.actualizarEvento(id, evento);
        if (eventoActualizado != null) {
            return ResponseEntity.ok(eventoActualizado);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> eliminarEvento(@PathVariable Long id) {
        eventoService.eliminarEvento(id);
        return ResponseEntity.noContent().build();
    }
}

