package pe.edu.uni.ventaapp.service;

import pe.edu.uni.ventaapp.dto.VentaDto;

/**
 *
 * @author Gustavo Coronel
 */
public class VentaService {
	
	public VentaDto calcularVenta(VentaDto dto){
		// Proceso
		double total = to2dec(dto.getPrecio() * dto.getCantidad());
		double importe = to2dec(total / 1.18);
		double impuesto = to2dec( total - importe );
		// Reporte
		dto.setImporte(importe);
		dto.setImpuesto(impuesto);
		dto.setTotal(total);
		return dto;
	}
	
	private double to2dec(double valor){
		valor *= 100.0;
		valor = Math.round(valor);
		valor /= 100.0;
		return valor;
	}

}
