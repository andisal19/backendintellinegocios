package com.intellinegocios.controlador;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.intellinegocios.excepciones.ResourceNotFoundException;
import com.intellinegocios.modelo.kpi_01;
import com.intellinegocios.modelo.kpi_02;
import com.intellinegocios.repositorio.kpi_01Repositorio;
import com.intellinegocios.repositorio.kpi_02Repositorio;

@RestController
@RequestMapping("/apiRestkpi/v1/")
@CrossOrigin(origins = "http://localhost:4200")
public class kpi01Controller {

	@Autowired
	private kpi_01Repositorio repositoriokpi01;

	// Metodo para crear la lista de los usuarios.
	@GetMapping("/kpi_01")
	public List<kpi_01> listarkpi01() {
		return repositoriokpi01.findAll();
	}
}
