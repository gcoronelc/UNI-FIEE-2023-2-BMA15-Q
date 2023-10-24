package pe.edu.uni.aprendiendojava.prueba;

import pe.edu.uni.aprendiendojava.dto.MateDto;
import pe.edu.uni.aprendiendojava.service.MateService;

public class Prueba02 {

	public static void main(String[] args) {
		// Datos
		String str1 = new String("Gustavo");
		System.out.println("str1: " + str1);
		// Proceso
		MateService service = new MateService();
		service.modificar(str1);
		// Reporte
		System.out.println("str1: " + str1);
	}
	
}
