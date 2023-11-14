package pe.edu.uni.proyecto1_quispe.pruebas;

import pe.edu.uni.proyecto1_quispe.service.TrianguloEquilatero;

public class Prueba01 {

	public static void main(String[] args) {
		// Triángulo inválido
		TrianguloEquilatero figura = new TrianguloEquilatero(-1);
		System.out.println("Condición: " + figura.esValido());
		// Cálculo de área y perímetro
		System.out.println("--------------------");
		figura = new TrianguloEquilatero(5);
		System.out.println("Triángulo válido: " + figura.esValido());
		System.out.println("Perímetro: " + figura.calcularPerimetro());
		System.out.println("Área: " + figura.calcularArea());
	}
}
