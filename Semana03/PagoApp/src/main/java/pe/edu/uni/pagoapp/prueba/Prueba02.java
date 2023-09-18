package pe.edu.uni.pagoapp.prueba;

import pe.edu.uni.pagoapp.dto.PagoDto;
import pe.edu.uni.pagoapp.service.PagoService;

/**
 *
 * @author Gustavo Coronel
 */
public class Prueba02 {
	
	public static void main(String[] args) {
		// Datos
		PagoDto dto = new PagoDto(6, 20, 10.0);
		// Proceso
		PagoService service = new PagoService();
		dto = service.procesarSueldo(dto);
		// Reporte
		System.out.println("Ingresos: " + dto.getIngresos());
		System.out.println("Renta: " + dto.getRenta());
		System.out.println("Sueldo: " + dto.getSueldoNeto());
	}

}
