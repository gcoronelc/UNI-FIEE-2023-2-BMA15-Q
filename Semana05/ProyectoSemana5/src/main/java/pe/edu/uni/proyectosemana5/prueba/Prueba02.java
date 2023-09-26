package pe.edu.uni.proyectosemana5.prueba;

import pe.edu.uni.proyectosemana5.service.MateService;

/**
 *
 * @author Gustavo Coronel
 */
public class Prueba02 {

	/**
	 * @param args the command line arguments
	 */
	public static void main(String[] args) {
		// Datos
		long arreglo[][] = new long[15][2];
		// Proceso
		MateService service = new MateService();
		int i = 0;
		while (i < arreglo.length) {
			long f = service.factorialV2(i);
			arreglo[i][0] = i;
			arreglo[i][1] = f;
			i++;
		}
		// Reporte
		for(int j=0; j < arreglo.length;j++){
			System.out.println("Factorial de " + arreglo[j][0] + " es " + arreglo[j][1]);
		}
	}

}
