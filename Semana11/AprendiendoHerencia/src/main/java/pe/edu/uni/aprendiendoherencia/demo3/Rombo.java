package pe.edu.uni.aprendiendoherencia.demo3;

public class Rombo extends FiguraAbstract {

	private double diag1;
	private double diag2;

	public Rombo() {
	}

	public Rombo(double diag1, double diag2) {
		this.diag1 = diag1;
		this.diag2 = diag2;
	}

	public double getDiag1() {
		return diag1;
	}

	public void setDiag1(double diag1) {
		this.diag1 = diag1;
	}

	public double getDiag2() {
		return diag2;
	}

	public void setDiag2(double diag2) {
		this.diag2 = diag2;
	}

	@Override
	public double calcArea() {
		return diag1 * diag2 / 2.0;
	}

}
