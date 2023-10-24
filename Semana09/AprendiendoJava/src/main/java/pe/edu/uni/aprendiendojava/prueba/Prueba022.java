package pe.edu.uni.aprendiendojava.prueba;

import pe.edu.uni.aprendiendojava.service.MateService01;

public class Prueba022 {

	public static void main(String[] args) {
		// Datos
		String str1 = "Gustavo";
		System.out.println("str1: " + str1);
		// Proceso
		MateService01.modificar(str1);
		// Reporte
		System.out.println("str1: " + str1);
	}
	
}
