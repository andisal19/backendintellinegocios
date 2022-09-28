package com.intellinegocios.repositorio;

import java.sql.SQLException;
import java.text.DecimalFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.HashMap;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

import com.intellinegocios.Config;
import com.intellinegocios.modelo.kpi_01;
import com.intellinegocios.modelo.kpi_02;

/**
 * @author Cesar Giraldo
 *
 */
public class ServicioRepositorio {

	public ServicioRepositorio() {

	}

	/**
	 * @param documento
	 * @param codServicio
	 * @param codPuntoVenta
	 * @param idTrama
	 * @return Objeto Consolidadoventaservicios. Los datos son: codigo de servicio,
	 *         zona, ccosto, sucursal, fecha venta, numero formularios, venta bruta,
	 *         venta bruta sin iva, iva y las comisiones
	 * @throws SQLException
	 */
	public List<kpi_01> getKpi01(String zona) {
		Config configuration = new Config();
		try {

			List<kpi_01> clientes = null;
			kpi_01 cliente = new kpi_01();

			DataSource datasource = configuration.conexion();
			JdbcTemplate jdbcTemplate = new JdbcTemplate(datasource);


			String sql = "SELECT * FROM `kpi_01` As k1 WHERE k1.zona = '" + zona + "'";

			clientes = jdbcTemplate.query(sql,
					new BeanPropertyRowMapper<>(kpi_01.class));
			

			return clientes;

		} catch (Exception e) {
			System.out.println(
					"Error en getKpi01(). Sql exception: " + e.getMessage());
			return null;

		}
	}
	
	// No funciona la funcion
	public List<Double>  formulaKpi1 () {
		
		Config configuration = new Config();
		try {
			List<Double> resultado;
			
			DataSource datasource = configuration.conexion();
			JdbcTemplate jdbcTemplate = new JdbcTemplate(datasource);
			
			String sql = ""
					+ "SELECT (\r\n"
					+ "    ((SELECT COUNT(`fecha_de_afliliacion`) FROM `kpi_01` WHERE `fecha_de_afliliacion` LIKE '%/08/2022')\r\n"
					+ "    -\r\n"
					+ "    (SELECT COUNT(`fecha_de_afliliacion`) FROM `kpi_01` WHERE `fecha_de_afliliacion` LIKE '%/07/2022'))\r\n"
					+ "    / \r\n"
					+ "    (SELECT COUNT(`fecha_de_afliliacion`) FROM `kpi_01` WHERE `fecha_de_afliliacion` LIKE '%/08/2022')\r\n"
					+ "    * 100\r\n"
					+ "    \r\n"
					+ ") AS KPI_TDC;";
			
			resultado = jdbcTemplate.query(sql,
					new BeanPropertyRowMapper<>(Double.class));
			
			return resultado;
			
		}catch (Exception e) {
			System.out.println(
					"Error en getKpi01(). Sql exception: " + e.getMessage());
			return null;

		}
	}

}
