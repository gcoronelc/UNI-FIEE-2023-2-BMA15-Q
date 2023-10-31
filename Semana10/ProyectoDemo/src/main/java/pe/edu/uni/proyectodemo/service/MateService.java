package pe.edu.uni.proyectodemo.service;

public class MateService {

	private MateService() {
	}

	public static long factorial(int n) {
		if (n == 0 || n == 1) {
			return 1;
		}
		return n * factorial(n - 1);
	}

	public static int mcd(int n1, int n2) {

		return 0;
	}

	public static int mcm(int n1, int n2) {

		return 0;
	}

	public static int[] fibobacci(int n) {

		return null;
	}

	public static boolean esPrimo(int n) {

		return true;
	}

}
