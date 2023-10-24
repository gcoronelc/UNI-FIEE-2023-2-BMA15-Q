package pe.edu.uni.aprendiendojava.prueba;

import pe.edu.uni.aprendiendojava.dto.MateDto;
import pe.edu.uni.aprendiendojava.service.MateService;

public class Prueba01 {

	public static void main(String[] args) {
		// Datos
		MateDto dto = new MateDto(6, 4);
		// Proceso
		MateService service = new MateService();
		service.calcular(dto);
		// Reporte
		System.out.println("Suma: " + dto.getSuma());
		System.out.println("Producto: " + dto.getProducto());
	}
	
}
