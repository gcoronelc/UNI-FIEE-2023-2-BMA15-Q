package pe.edu.uni.proyectodemo.prueba;

import pe.edu.uni.proyectodemo.service.MateService;

public class Prueba01 {

	public static void main(String[] args) {

		for (int i = 0; i <= 6; i++) {
			System.out.println("Factorial de " + i + " es " + MateService.factorial(i));
		}

	}

}
