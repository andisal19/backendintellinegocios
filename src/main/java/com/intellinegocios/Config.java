package com.intellinegocios;

import javax.sql.DataSource;

import org.springframework.jdbc.datasource.DriverManagerDataSource;

import com.intellinegocios.modelo.Constantes.DATASOURCE;;

public class Config {
//SE GENERA LA CONEXION DE BASE DE DATOS
	public DataSource conexion() {
		DriverManagerDataSource driverManagerDataSource = new DriverManagerDataSource();
		driverManagerDataSource.setUrl(DATASOURCE.url);
		driverManagerDataSource.setUsername(DATASOURCE.user);
		driverManagerDataSource.setPassword(DATASOURCE.pass);
		driverManagerDataSource.setDriverClassName("com.mysql.cj.jdbc.Driver");
		return driverManagerDataSource;
	}
}
