package pe.edu.uni.promedioapp.prueba;

import pe.edu.uni.promedioapp.dto.NotasDto;
import pe.edu.uni.promedioapp.service.NotasService;

/**
 *
 * @author PROFESOR
 */
public class Prueba02 {

	public static void main(String[] args) {
		// Datos
		NotasDto dto = new NotasDto(10, 12, 11, "B");
		// Proceso
		NotasService service = new NotasService();
		dto = service.procesar(dto);
		// Reporte
		System.out.println("Promedio final: " + dto.getPromFinal());
		System.out.println("Condición: " + dto.getCondicion());
	}
}
