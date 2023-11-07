package pe.edu.uni.aprendiendoherencia.demo3;

public class Circulo extends FiguraAbstract {
	
	private double radio;

	public Circulo(double radio) {
		this.radio = radio;
	}
	
	@Override
	public double calcArea() {
		return radio * radio * Math.PI;
	}

}
