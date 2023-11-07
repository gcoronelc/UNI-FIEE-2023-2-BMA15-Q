package pe.edu.uni.aprendiendoherencia.demo1;

public class Clase2 extends Clase1 {

	public Clase2() {
		super("Gustavo");
		//System.out.println("Hola");
	}

	@Override
	public int sumar(int n1, int n2) {
		return super.sumar(n1, n2) * (n1 - n2);
	}

}
