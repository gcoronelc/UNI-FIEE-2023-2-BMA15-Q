package pe.edu.uni.proyectosemana5.prueba;

import pe.edu.uni.proyectosemana5.service.MateService;

/**
 *
 * @author Gustavo Coronel
 */
public class Prueba04{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Datos
		  int n1 = 0;
		  int n2 = 1;
		  int n3 = 5;
		  // Proceso
		  MateService service = new MateService();
		  long f1 = service.factorialV4(n1);
		  long f2 = service.factorialV4(n2);
		  long f3 = service.factorialV4(n3);
		  // Reporte
		  System.out.println("Factorial de " + n1 + " es " + f1);
		  System.out.println("Factorial de " + n2 + " es " + f2);
		  System.out.println("Factorial de " + n3 + " es " + f3);
    }

}
