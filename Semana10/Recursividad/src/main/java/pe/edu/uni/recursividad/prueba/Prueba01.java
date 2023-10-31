package pe.edu.uni.recursividad.prueba;

import pe.edu.uni.recursividad.service.AppService;

/**
 *
 * @author PROFESOR
 */
public class Prueba01 {
	
	public static void main(String[] args) {
		double base = 2;
		AppService service = new AppService();
		for(int i=0; i <= 5; i++){
			String cadena =  base + " elevado a la exponente ";
			cadena += i + " es " + service.potencia(base, i);
			System.out.println(cadena);
		}
		
	}

}
