package pe.edu.uni.proyecto1_taipe.servicios;

import pe.edu.uni.proyecto1_taipe.dto.TrianguloDto;

/**
 *
 * @author PROFESOR
 */
public class ServiciosTriangulo {

	public TrianguloDto determinavalidez(TrianguloDto dto) {
		//proceso
		String validez = "es valido";
		validez = (((dto.getLadoA() + dto.getLadoB()) > dto.getLadoC()) && ((dto.getLadoC() + dto.getLadoB()) > dto.getLadoA()) && ((dto.getLadoA() + dto.getLadoC()) > dto.getLadoB()) ? "es valido" : "no es valido");
		//Reporte
		dto.setValidez(validez);
		return dto;
	}

	public TrianguloDto calculaPerimetro(TrianguloDto dto) {
		//proceso
		double perimetro = dto.getLadoA() + dto.getLadoB() + dto.getLadoC();
		//reporte
		dto.setPerimetro(perimetro);
		return dto;
	}

	public TrianguloDto calculaArea(TrianguloDto dto) {
		//proceso
		double semi = (dto.getLadoA() + dto.getLadoB() + dto.getLadoC()) / 2.0;
		double area = Math.sqrt(semi * (semi - dto.getLadoB()) * (semi - dto.getLadoA()) * (semi - dto.getLadoC()));
		//reporte
		dto.setArea(area);
		return dto;
	}
}
