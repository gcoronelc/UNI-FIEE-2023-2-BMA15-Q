package pe.edu.uni.proyecto2_taipe.EcuacionDto;

/**
 *
 * @author PROFESOR
 */
public class ecuacionDto {
	//datos

	private int A;
	private int B;
	private int C;
	//reporte
	private String condicion;
	private double X1;
	private double X2;

	public ecuacionDto() {
	}

	public ecuacionDto(int A, int B, int C) {
		this.A = A;
		this.B = B;
		this.C = C;
	}

	public int getA() {
		return A;
	}

	public void setA(int A) {
		this.A = A;
	}

	public int getB() {
		return B;
	}

	public void setB(int B) {
		this.B = B;
	}

	public int getC() {
		return C;
	}

	public void setC(int C) {
		this.C = C;
	}

	public String getCondicion() {
		return condicion;
	}

	public void setCondicion(String condicion) {
		this.condicion = condicion;
	}

	public double getX1() {
		return X1;
	}

	public void setX1(double X1) {
		this.X1 = X1;
	}

	public double getX2() {
		return X2;
	}

	public void setX2(double X2) {
		this.X2 = X2;
	}

}
