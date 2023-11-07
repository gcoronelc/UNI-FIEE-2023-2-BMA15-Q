package pe.edu.uni.aprendiendoherencia.demo2;

public class Mate extends AbstractMate {

	@Override
	public long factorial(int n) {
		long f = 1;
		while (n > 1) {
			f *= n--;
		}
		return f;
	}

}
