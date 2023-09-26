package pe.edu.uni.proyecto2_taipe.Servicios;

import pe.edu.uni.proyecto2_taipe.EcuacionDto.ecuacionDto;

/**
 *
 * @author PROFESOR
 */
public class RaicesEcuacion {

	public ecuacionDto determinaValidez(ecuacionDto dto) {
		//proceso
		String condicion = (Math.pow(dto.getB(), 2) - 4 * dto.getA() * dto.getC() >= 0) ? "tiene raices reales" : "no tiene raices reales";
		//reporte
		dto.setCondicion(condicion);
		return dto;
	}

	public ecuacionDto hallarRaices(ecuacionDto dto) {
		//proceso
		double X1 = (-dto.getB() + Math.sqrt(Math.pow(dto.getB(), 2) - 4 * dto.getA() * dto.getC())) / (2.0 * dto.getA());
		double X2 = (-dto.getB() - Math.sqrt(Math.pow(dto.getB(), 2) - 4 * dto.getA() * dto.getC())) / (2.0 * dto.getA());
		//reporte
		dto.setX1(X1);
		dto.setX2(X2);
		return dto;
	}
}
