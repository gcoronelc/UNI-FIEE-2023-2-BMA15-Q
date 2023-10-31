package pe.edu.uni.aplicandorecursividad.prueba;

import pe.edu.uni.aplicandorecursividad.service.AppService;

public class Prueba01 {

	public static void main(String args[]){
		AppService service = new AppService();
		for(int i=0; i<=10;i++){
			String cadena = "Factorial de " + i;
			cadena += " es " + service.factorial(i);
			System.out.println(cadena);
		}
		
	}
}
