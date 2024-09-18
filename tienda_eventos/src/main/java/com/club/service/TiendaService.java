package com.club.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.club.model.TiendaModel;
import com.club.repository.TiendaRepository;

@Service
public class TiendaService {
	@Autowired
	private TiendaRepository tiendaRepository;
	
	public List<TiendaModel> listarProductos(){
		return tiendaRepository.findAll();
	}
	
	 public Optional<TiendaModel> obtenerProductoPorId(Long id) {
	        return tiendaRepository.findById(id);
	    }

	    public TiendaModel crearProducto(TiendaModel tienda) {
	        return tiendaRepository.save(tienda);
	    }

	    public TiendaModel actualizarTienda(Long id, TiendaModel tienda) {
	        Optional<TiendaModel> tiendaExistente = tiendaRepository.findById(id);
	        if (tiendaExistente.isPresent()) {
	            TiendaModel tiendaActualizada = tiendaExistente.get();
	            tiendaActualizada.setNombre(tienda.getNombre());
	            tiendaActualizada.setDescripcion(tienda.getDescripcion());
	          
	            /*eventoActualizado.setImagenDestacada(evento.getImagenDestacada());
	            eventoActualizado.setCategoria(evento.getCategoria());*/
	            tiendaActualizada.setPrice(tienda.getPrice());
	            tiendaActualizada.setIntercambio(tienda.isIntercambio());	          
	            return tiendaRepository.save(tiendaActualizada);
	        }
	        return null;
	    }

	    public void eliminarProducto(Long id) {
	        tiendaRepository.deleteById(id);
	    }

		public TiendaModel guardarProducto(TiendaModel tienda) {
			// TODO Auto-generated method stub
		    return tiendaRepository.save(tienda);    
		}
}
