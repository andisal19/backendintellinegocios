package com.intellinegocios.modelo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "kpi_02")
public class kpi_02 {
	@Id
	@Column(name = "zona")
	private String zona;
	@Column(name = "cliente")
	private String cliente;
	@Column(name = "prioridad")
	private String prioridad;
	@Column(name = "falla")
	private String falla;
	@Column(name = "fecha_de_creacion")
	private String fecha_de_creacion;
	@Column(name = "fecha_de_cierre")
	private String fecha_de_cierre;
	@Column(name = "tiempo_total")
	private String tiempo_total;
	
	
	public kpi_02() {
		super();
	}


	public kpi_02(String zona, String cliente, String prioridad, String falla, String fecha_de_creacion,
			String fecha_de_cierre, String tiempo_total) {
		super();
		this.zona = zona;
		this.cliente = cliente;
		this.prioridad = prioridad;
		this.falla = falla;
		this.fecha_de_creacion = fecha_de_creacion;
		this.fecha_de_cierre = fecha_de_cierre;
		this.tiempo_total = tiempo_total;
	}


	public String getZona() {
		return zona;
	}


	public void setZona(String zona) {
		this.zona = zona;
	}


	public String getCliente() {
		return cliente;
	}


	public void setCliente(String cliente) {
		this.cliente = cliente;
	}


	public String getPrioridad() {
		return prioridad;
	}


	public void setPrioridad(String prioridad) {
		this.prioridad = prioridad;
	}


	public String getFalla() {
		return falla;
	}


	public void setFalla(String falla) {
		this.falla = falla;
	}


	public String getFecha_de_creacion() {
		return fecha_de_creacion;
	}


	public void setFecha_de_creacion(String fecha_de_creacion) {
		this.fecha_de_creacion = fecha_de_creacion;
	}


	public String getFecha_de_cierre() {
		return fecha_de_cierre;
	}


	public void setFecha_de_cierre(String fecha_de_cierre) {
		this.fecha_de_cierre = fecha_de_cierre;
	}


	public String getTiempo_total() {
		return tiempo_total;
	}


	public void setTiempo_total(String tiempo_total) {
		this.tiempo_total = tiempo_total;
	}


	

}