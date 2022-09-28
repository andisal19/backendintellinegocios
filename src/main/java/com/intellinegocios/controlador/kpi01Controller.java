package com.intellinegocios.controlador;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.intellinegocios.modelo.kpi_01;
import com.intellinegocios.repositorio.kpi_01Repositorio;
import com.intellinegocios.services.kpiServices;

@RestController
@RequestMapping("/apiRestkpi/v1/")
@CrossOrigin(origins = "http://localhost:4200")
public class kpi01Controller {

	@Autowired
	private kpi_01Repositorio repositoriokpi01;

	@Autowired
	private kpiServices kpiservices;
	

	// Metodo para crear la lista de los usuarios.
	@GetMapping("/kpi_01")
	public List<kpi_01> listarkpi01() {
		return repositoriokpi01.findAll();
	}

	@PostMapping(path = { "/validacion/{zona}" })
	public List<kpi_01> setValidacion(@PathVariable String zona) {

		List<kpi_01> Listaresultado = null;
		try {
			Listaresultado = kpiservices.getKpiServices(zona);
			return Listaresultado;
		} catch (Exception e) {
			System.out.println("Error en el controller " + e.getMessage());
			return null;
		}
	}
	
	@GetMapping("/formula")
	public List<Double> formula1() {
		return kpiservices.getResultadoKpi();
	}
}
