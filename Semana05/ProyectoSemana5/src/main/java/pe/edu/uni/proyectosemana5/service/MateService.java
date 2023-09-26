package pe.edu.uni.proyectosemana5.service;

/**
 *
 * @author PROFESOR
 */
public class MateService {

	public long factorialV1(int n) {
		long f;
		// Inicio del proceso
		f = 1;
		for (int i = 2; i <= n; i++) {
			f *= i;
		}
		// Fin del proceso
		return f;
	}

	public long factorialV2(int n) {
		long f;
		// Inicio del proceso
		f = 1;
		for (int i = 2; i <= n; f *= i, i++);
		// Fin del proceso
		return f;
	}

	public long factorialV3(int n) {
		long f;
		// Inicio del proceso
		f = 1;
		while (n > 1) {
			f *= n--;
		}
		// Fin del proceso
		return f;
	}

	public long factorialV4(int n) {
		if (n == 0 || n == 1) {
			return 1;
		}
		return n * factorialV4(n - 1);
	}

}
