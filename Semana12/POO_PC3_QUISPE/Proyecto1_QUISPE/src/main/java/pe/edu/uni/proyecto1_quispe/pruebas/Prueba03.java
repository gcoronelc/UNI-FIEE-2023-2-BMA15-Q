package pe.edu.uni.proyecto1_quispe.pruebas;

import pe.edu.uni.proyecto1_quispe.service.TrianguloEscaleno;

public class Prueba03 {

	public static void main(String[] args) {
		TrianguloEscaleno figura;
		// Triángulo inválido caso 1
		figura = new TrianguloEscaleno(1, 1, 3);
		System.out.println("Condición figura 1: " + figura.esValido());
		// Triángulo inválido caso 2
		figura = new TrianguloEscaleno(2, 2, -2);
		System.out.println("Condición figura 2: " + figura.esValido());
		// Cálculo de área y perímetro
		System.out.println("------------------------------");
		figura = new TrianguloEscaleno(4, 5, 3);
		System.out.println("Triángulo válido: " + figura.esValido());
		System.out.println("Perímetro: " + figura.calcularPerimetro());
		System.out.println("Área: " + figura.calcularArea());
	}
}
