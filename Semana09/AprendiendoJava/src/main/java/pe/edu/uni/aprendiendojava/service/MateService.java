package pe.edu.uni.aprendiendojava.service;

import pe.edu.uni.aprendiendojava.dto.MateDto;

public class MateService {

	public void calcular(MateDto dto){
		dto.setSuma(dto.getN1() + dto.getN2());
		dto.setProducto(dto.getN1() * dto.getN2());
	}
	
	public void modificar(String cadena){
		System.out.println("Cadena original: " + cadena);
		cadena = "Gustavo Coronel";
		System.out.println("Cadena modificada: " + cadena);
	}
}
