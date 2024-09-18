package com.club.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.club.model.EventoModel;
import com.club.repository.EventoRepository;

@Service
public class EventoService {
	@Autowired
    private EventoRepository eventoRepository;

    public List<EventoModel> listarEventos() {
        return eventoRepository.findAll();
    }

    public Optional<EventoModel> obtenerEventoPorId(Long id) {
        return eventoRepository.findById(id);
    }

    public EventoModel crearEvento(EventoModel evento) {
        if (evento.getPlazasDisponibles() == null) {
            evento.setPlazasDisponibles(evento.getCupoMaximo());
        }
        return eventoRepository.save(evento);
    }

    public EventoModel actualizarEvento(Long id, EventoModel evento) {
        Optional<EventoModel> eventoExistente = eventoRepository.findById(id);
        if (eventoExistente.isPresent()) {
            EventoModel eventoActualizado = eventoExistente.get();
            eventoActualizado.setNombre(evento.getNombre());
            eventoActualizado.setFechaHora(evento.getFechaHora());
            eventoActualizado.setLugar(evento.getLugar());
            eventoActualizado.setDescripcion(evento.getDescripcion());
            eventoActualizado.setCupoMaximo(evento.getCupoMaximo());
            /*eventoActualizado.setImagenDestacada(evento.getImagenDestacada());
            eventoActualizado.setCategoria(evento.getCategoria());*/
            eventoActualizado.setTipoEvento(evento.getTipoEvento());
            eventoActualizado.setPrecio(evento.getPrecio());
            eventoActualizado.setEsVirtual(evento.getEsVirtual());
            eventoActualizado.setPlazasDisponibles(evento.getPlazasDisponibles());
            eventoActualizado.setCantidadParticipantes(evento.getCantidadParticipantes());
            return eventoRepository.save(eventoActualizado);
        }
        return null;
    }

    public void eliminarEvento(Long id) {
        eventoRepository.deleteById(id);
    }

	public EventoModel guardarEvento(EventoModel evento) {
		// TODO Auto-generated method stub
	    return eventoRepository.save(evento);    
	}
}
