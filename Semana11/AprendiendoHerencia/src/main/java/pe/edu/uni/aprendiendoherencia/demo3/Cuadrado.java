package pe.edu.uni.aprendiendoherencia.demo3;

public class Cuadrado extends FiguraAbstract{

	private double lado;

	public Cuadrado(double lado) {
		this.lado = lado;
	}
		
	@Override
	public double calcArea() {
		return lado * lado;
	}

}
