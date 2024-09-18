package com.club.model;

import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "events")
public class EventoModel {
	 @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    //private Long eventoId;
	    //private String nombre;
	    private LocalDateTime fechaHora;
	    private String lugar;
	    //private String descripcion;
	    private String cupoMaximo;
	    private String plazasDisponibles;
	    private String tipoEvento;
	    private Double precio;
	    private Boolean esVirtual;
	    private Integer CantidadParticipantes;

	    
	    @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    @Column(name = "EventoId")
	    private Long eventoId;

	    @Column(name = "nombre", nullable = false, length = 50)
	    private String nombre;

	    @Column(name = "descripción", length = 200)
	    private String descripcion;
	    
	    // Getters and Setters
	    public Long getEventoId() {
			return eventoId;
		}
		public void setEventoId(Long eventoId) {
			this.eventoId = eventoId;
		}
		public String getNombre() {
			return nombre;
		}
		public void setNombre(String nombre) {
			this.nombre = nombre;
		}
		public LocalDateTime getFechaHora() {
			return fechaHora;
		}
		public void setFechaHora(LocalDateTime fechaHora) {
			this.fechaHora = fechaHora;
		}
		public String getLugar() {
			return lugar;
		}
		public void setLugar(String lugar) {
			this.lugar = lugar;
		}
		public String getDescripcion() {
			return descripcion;
		}
		public void setDescripcion(String descripcion) {
			this.descripcion = descripcion;
		}
		public String getCupoMaximo() {
			return cupoMaximo;
		}
		public void setCupoMaximo(String cupoMaximo) {
			this.cupoMaximo = cupoMaximo;
		}
		public String getPlazasDisponibles() {
			return plazasDisponibles;
		}
		public void setPlazasDisponibles(String plazasDisponibles) {
			this.plazasDisponibles = plazasDisponibles;
		}
		public String getTipoEvento() {
			return tipoEvento;
		}
		public void setTipoEvento(String tipoEvento) {
			this.tipoEvento = tipoEvento;
		}
		public Double getPrecio() {
			return precio;
		}
		public void setPrecio(Double precio) {
			this.precio = precio;
		}
		public Boolean getEsVirtual() {
			return esVirtual;
		}
		public void setEsVirtual(Boolean esVirtual) {
			this.esVirtual = esVirtual;
		}
		public Integer getCantidadParticipantes() {
			return CantidadParticipantes;
		}
		public void setCantidadParticipantes(Integer cantidadParticipantes) {
			CantidadParticipantes = cantidadParticipantes;
		}
}
