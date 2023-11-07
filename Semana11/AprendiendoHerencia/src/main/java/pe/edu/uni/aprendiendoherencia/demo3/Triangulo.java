package pe.edu.uni.aprendiendoherencia.demo3;

public class Triangulo extends FiguraAbstract {

	private double base;
	private double altura;

	public Triangulo(double base, double altura) {
		this.base = base;
		this.altura = altura;
	}

	@Override
	public double calcArea() {
		double area = base * altura / 2.0;
		return area;
	}
}
