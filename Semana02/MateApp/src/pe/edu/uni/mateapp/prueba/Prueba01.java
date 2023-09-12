package pe.edu.uni.mateapp.prueba;

import pe.edu.uni.mateapp.service.MateService;

/**
 *
 * @author PROFESOR
 */
public class Prueba01 {
	
	public static void main(String[] args) {
		// Variables
		int num1, num2, suma;
		// Datos
		num1 = 8;
		num2 = 15;
		// Proceso
		MateService service = new MateService();
		suma = service.sumar(num1, num2);
		// Reporte
		System.out.println("Numero 1: " + num1);
		System.out.println("Numero 2: " + num2);
		System.out.println("Suma: " + suma);
	}
	
}
