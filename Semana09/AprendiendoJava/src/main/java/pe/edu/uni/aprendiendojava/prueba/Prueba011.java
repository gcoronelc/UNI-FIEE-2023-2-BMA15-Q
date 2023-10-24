package pe.edu.uni.aprendiendojava.prueba;

import pe.edu.uni.aprendiendojava.dto.MateDto;
import pe.edu.uni.aprendiendojava.service.MateService01;

public class Prueba011 {

	public static void main(String[] args) {
		// Datos
		MateDto dto = new MateDto(6, 4);
		// Proceso
		MateService01.calcular(dto);
		// Reporte
		System.out.println("Suma: " + dto.getSuma());
		System.out.println("Producto: " + dto.getProducto());
	}
	
}
