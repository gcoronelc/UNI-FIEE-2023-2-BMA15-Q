package pe.edu.uni.proyecto1_quispe.service;

public class TrianguloIsosceles extends TrianguloAbstract {

	private double ladoBase;
	private double altura;

	public TrianguloIsosceles(double ladoBase, double altura) {
		this.ladoBase = ladoBase;
		this.altura = altura;
	}

	@Override
	public boolean esValido() {
		return (ladoBase > 0 && altura > 0);
	}

	@Override
	public double calcularPerimetro() {
		// Se halla los cuadrados
		double mitadBase2 = (ladoBase / 2.0) * (ladoBase / 2.0);
		double altura2 = altura * altura;
		// Se aplica teorema de pitágoras
		double ladoIgual = Math.sqrt(altura2 + mitadBase2);
		// Se retorna el perímetro
		return (ladoIgual * 2) + ladoBase;
	}

	@Override
	public double calcularArea() {
		return ladoBase * altura / 2.0;
	}

}
