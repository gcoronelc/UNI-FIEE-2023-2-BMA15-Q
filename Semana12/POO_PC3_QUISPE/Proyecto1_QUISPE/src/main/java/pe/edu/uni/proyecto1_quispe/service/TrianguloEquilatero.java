package pe.edu.uni.proyecto1_quispe.service;

public class TrianguloEquilatero extends TrianguloAbstract {

	private double lado = 0;

	public TrianguloEquilatero(double lado) {
		this.lado = lado;
	}

	@Override
	public boolean esValido() {
		return (lado > 0);
	}

	@Override
	public double calcularPerimetro() {
		return lado * 3;
	}

	@Override
	public double calcularArea() {
		double h = lado * Math.sqrt(3) / 2.0;
		return lado * h / 2.0;
	}

}
