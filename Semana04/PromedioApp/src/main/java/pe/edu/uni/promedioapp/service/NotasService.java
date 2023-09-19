package pe.edu.uni.promedioapp.service;

import pe.edu.uni.promedioapp.dto.NotasDto;

/**
 *
 * @author PROFESOR
 */
public class NotasService {

	public NotasDto procesar(NotasDto dto) {
		// Proceso
		double promFinal = 0.0;
		switch (dto.getSistema()) {
			case "A":
				promFinal = (dto.getPromPracticas() + dto.getExaParcial() + dto.getExaFinal()) / 3;
				break;
			case "B":
				promFinal = (dto.getPromPracticas() * 2 + dto.getExaParcial() + dto.getExaFinal()) / 4;
				break;
			case "C":
				promFinal = (dto.getPromPracticas() + dto.getExaParcial() + dto.getExaFinal() * 2) / 4;
				break;
		}
		String condicion = (promFinal>=10)?"Aprobado":"Desaprobado";
		// Reporte
		dto.setPromFinal(promFinal);
		dto.setCondicion(condicion);
		return dto;
	}

}
