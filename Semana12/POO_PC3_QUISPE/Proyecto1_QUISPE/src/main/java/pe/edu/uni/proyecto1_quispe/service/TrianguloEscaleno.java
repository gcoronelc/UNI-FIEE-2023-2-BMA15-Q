package pe.edu.uni.proyecto1_quispe.service;

public class TrianguloEscaleno extends TrianguloAbstract {

	private double lado1;
	private double lado2;
	private double lado3;

	public TrianguloEscaleno(double lado1, double lado2, double lado3) {
		this.lado1 = lado1;
		this.lado2 = lado2;
		this.lado3 = lado3;
	}

	@Override
	public boolean esValido() {
		boolean positivos = lado1 > 0 && lado2 > 0 && lado3 > 0;
		// Teorema de existencia del triángulo
		boolean condicion1 = (lado1 + lado2) > lado3;
		boolean condicion2 = (lado2 + lado3) > lado1;
		boolean condicion3 = (lado3 + lado1) > lado2;
		// Se deben cumplir todas las condiciones
		return positivos && condicion1 && condicion2 && condicion3;
	}

	@Override
	public double calcularPerimetro() {
		return lado1 + lado2 + lado3;
	}

	@Override
	public double calcularArea() {
		// Se calcula el semiperímetro
		double semiPerimetro = calcularPerimetro() / 2.0;
		// Se halla cada término del teorme de Herón
		double parte1 = semiPerimetro - lado1;
		double parte2 = semiPerimetro - lado2;
		double parte3 = semiPerimetro - lado3;
		// Área con el teorema de Herón
		return Math.sqrt(semiPerimetro * parte1 * parte2 * parte3);
	}

}
