package com.intellinegocios.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.intellinegocios.modelo.kpi_01;
import com.intellinegocios.repositorio.ServicioRepositorio;

@Service
public class kpiServices {

	public List<kpi_01> getKpiServices(String zona) {

		ServicioRepositorio serviciorepositorio = new ServicioRepositorio();
		List<kpi_01> clientes = null;

		try {
			clientes = serviciorepositorio.getKpi01(zona);
			return clientes;

		} catch (Exception e) {
			System.out.println("Excepcion controlada de services " + e.getMessage());
			return null;
		}
	}
}
