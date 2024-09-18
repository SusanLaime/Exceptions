package com.club.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="store")
public class TiendaModel {
	
	private double price;
	private boolean intercambio;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name = "TiendaId")
	private Long tiendaId;
	
	@Column(name = "nombre", nullable = false, length = 50)
    private String nombre;

    @Column(name = "descripción", length = 200)
    private String descripcion;

	public Long getTiendaId() {
		return tiendaId;
	}

	public void setTiendaId(Long tiendaId) {
		this.tiendaId = tiendaId;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public boolean isIntercambio() {
		return intercambio;
	}

	public void setIntercambio(boolean intercambio) {
		this.intercambio = intercambio;
	}
}
