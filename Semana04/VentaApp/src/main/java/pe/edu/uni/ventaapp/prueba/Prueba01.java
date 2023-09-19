package pe.edu.uni.ventaapp.prueba;

import pe.edu.uni.ventaapp.dto.VentaDto;
import pe.edu.uni.ventaapp.service.VentaService;

/**
 *
 * @author PROFESOR
 */
public class Prueba01 {
	
	public static void main(String[] args) {
		// Datos
		VentaDto dto = new VentaDto(67.89, 8);
		// Proceso
		VentaService service = new VentaService();
		dto = service.calcularVenta(dto);
		// Reporte
		System.out.println("Importe: " + dto.getImporte());
		System.out.println("Impuesto: " + dto.getImpuesto());
		System.out.println("Total: " + dto.getTotal());
	}
}
