package com.intellinegocios.modelo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "usuarios")
public class Usuario {

	@Id
	@Column(name = "cedula")
	private String cedula;
	@Column(name = "primernombre")
	private String primernombre;
	@Column(name = "segundonombre")
	private String segundonombre;
	@Column(name = "primerapellido")
	private String primerapellido;
	@Column(name = "segundoapellido")
	private String segundoapellido;
	@Column(name = "clave")
	private String clave;
	@Column(name = "email")
	private String email;
	@Column(name = "nitempresa")
	private String nitempresa;
	@Column(name = "rol")
	private int rol;
	@Column(name = "estado")
	private int estado;

	public Usuario() {
		super();
	}

	public Usuario(String cedula, String primernombre, String segundonombre, String primerapellido,
			String segundoapellido, String clave, String email, String nitempresa, int rol, int estado) {
		super();
		this.cedula = cedula;
		this.primernombre = primernombre;
		this.segundonombre = segundonombre;
		this.primerapellido = primerapellido;
		this.segundoapellido = segundoapellido;
		this.clave = clave;
		this.email = email;
		this.nitempresa = nitempresa;
		this.rol = rol;
		this.estado = estado;
	}

	public String getCedula() {
		return cedula;
	}

	public void setCedula(String cedula) {
		this.cedula = cedula;
	}

	public String getPrimernombre() {
		return primernombre;
	}

	public void setPrimernombre(String primernombre) {
		this.primernombre = primernombre;
	}

	public String getSegundonombre() {
		return segundonombre;
	}

	public void setSegundonombre(String segundonombre) {
		this.segundonombre = segundonombre;
	}

	public String getPrimerapellido() {
		return primerapellido;
	}

	public void setPrimerapellido(String primerapellido) {
		this.primerapellido = primerapellido;
	}

	public String getSegundoapellido() {
		return segundoapellido;
	}

	public void setSegundoapellido(String segundoapellido) {
		this.segundoapellido = segundoapellido;
	}

	public String getClave() {
		return clave;
	}

	public void setClave(String clave) {
		this.clave = clave;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getNitempresa() {
		return nitempresa;
	}

	public void setNitempresa(String nitempresa) {
		this.nitempresa = nitempresa;
	}

	public int getRol() {
		return rol;
	}

	public void setRol(int rol) {
		this.rol = rol;
	}

	public int getEstado() {
		return estado;
	}

	public void setEstado(int estado) {
		this.estado = estado;
	}

}
