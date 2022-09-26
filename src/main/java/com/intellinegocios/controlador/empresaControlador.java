package com.intellinegocios.controlador;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.CrossOrigin;

import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.intellinegocios.modelo.kpi_01;
import com.intellinegocios.repositorio.kpi_01Repositorio;

@RestController
@RequestMapping("/apiRestkpi/v3/")
@CrossOrigin(origins = "http://localhost:4200")
public class empresaControlador {

	@Autowired
	private kpi_01Repositorio repositorio;

	// Metodo para crear la lista de las empresas.
	@GetMapping("/kpi_01")
	public List<kpi_01> listaRol() {
		return repositorio.findAll();
	}
}
