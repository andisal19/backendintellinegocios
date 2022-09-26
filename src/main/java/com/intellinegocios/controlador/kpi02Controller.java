package com.intellinegocios.controlador;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.intellinegocios.excepciones.ResourceNotFoundException;
import com.intellinegocios.modelo.kpi_02;
import com.intellinegocios.repositorio.kpi_01Repositorio;
import com.intellinegocios.repositorio.kpi_02Repositorio;

@RestController
@RequestMapping("/apiRestkpi/v2/")
@CrossOrigin(origins = "http://localhost:4200")
public class kpi02Controller {

	@Autowired
	private kpi_02Repositorio repositoriokpi02;

	// Metodo para crear la lista de las fallas.
	@GetMapping("/kpi_02")
	public List<kpi_02> listarkpi02() {
		return repositoriokpi02.findAll();
	}

}
