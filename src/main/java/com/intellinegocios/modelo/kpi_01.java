package com.intellinegocios.modelo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "kpi_01")
public class kpi_01 {
	@Id
	@Column(name = "id_cliente")
	private int id_cliente;
	@Column(name = "nombre")
	private String nombre;
	@Column(name = "zona")
	private String zona;
	@Column(name = "ciudad")
	private String ciudad;
	@Column(name = "servicio")
	private String servicio;
	@Column(name = "medio")
	private String medio;
	@Column(name = "fecha_de_afliliacion")
	private String fecha_de_afliliacion;
	
	
	public kpi_01() {
		super();
		// TODO Auto-generated constructor stub
	}


	public kpi_01(int id_cliente, String nombre, String zona, String ciudad, String servicio, String medio,
			String fecha_de_afliliacion) {
		super();
		this.id_cliente = id_cliente;
		this.nombre = nombre;
		this.zona = zona;
		this.ciudad = ciudad;
		this.servicio = servicio;
		this.medio = medio;
		this.fecha_de_afliliacion = fecha_de_afliliacion;
	}


	public int getId_cliente() {
		return id_cliente;
	}


	public void setId_cliente(int id_cliente) {
		this.id_cliente = id_cliente;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public String getZona() {
		return zona;
	}


	public void setZona(String zona) {
		this.zona = zona;
	}


	public String getCiudad() {
		return ciudad;
	}


	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}


	public String getServicio() {
		return servicio;
	}


	public void setServicio(String servicio) {
		this.servicio = servicio;
	}


	public String getMedio() {
		return medio;
	}


	public void setMedio(String medio) {
		this.medio = medio;
	}


	public String getFecha_de_afliliacion() {
		return fecha_de_afliliacion;
	}


	public void setFecha_de_afliliacion(String fecha_de_afliliacion) {
		this.fecha_de_afliliacion = fecha_de_afliliacion;
	}
	

	
	

}