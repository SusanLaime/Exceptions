package com.club.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.club.model.TiendaModel;
import com.club.service.TiendaService;

@RestController
@RequestMapping("/api/tienda")
public class TiendaController {

	    @Autowired
	    private TiendaService tiendaService;

	    @GetMapping
	    public List<TiendaModel> listarProductos() {
	        return tiendaService.listarProductos();
	    }

	    @GetMapping("/{id}")
	    public ResponseEntity<TiendaModel> obtenerProducto(@PathVariable Long id) {
	        Optional<TiendaModel> tienda = tiendaService.obtenerProductoPorId(id);
	        if (tienda.isPresent()) {
	            return ResponseEntity.ok(tienda.get());
	        } else {
	            return ResponseEntity.notFound().build();
	        }
	    }

	    @PostMapping("/tienda")
	    public TiendaModel crearProducto(@RequestBody TiendaModel producto) {
	        return tiendaService.crearProducto(producto);
	    }
	    public TiendaModel guardarProducto(@RequestBody TiendaModel producto) {
	        return tiendaService.guardarProducto(producto);
	    }

	    @PutMapping("/{id}")
	    public ResponseEntity<TiendaModel> actualizarTienda(@PathVariable Long id, @RequestBody TiendaModel tienda) {
	    	TiendaModel tiendaActualizado = tiendaService.actualizarTienda(id, tienda);
	        if (tiendaActualizado != null) {
	            return ResponseEntity.ok(tiendaActualizado);
	        } else {
	            return ResponseEntity.notFound().build();
	        }
	    }

	    @DeleteMapping("/{id}")
	    public ResponseEntity<Void> eliminarProducto(@PathVariable Long id) {
	        tiendaService.eliminarProducto(id);
	        return ResponseEntity.noContent().build();
	    }
}