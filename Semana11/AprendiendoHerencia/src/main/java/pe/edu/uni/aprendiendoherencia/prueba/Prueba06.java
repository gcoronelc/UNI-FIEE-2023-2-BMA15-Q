package pe.edu.uni.aprendiendoherencia.prueba;

import pe.edu.uni.aprendiendoherencia.demo3.FiguraAbstract;
import pe.edu.uni.aprendiendoherencia.demo3.Triangulo;


public class Prueba06 {

	public static void main(String[] args) {
		
		FiguraAbstract bean = new Triangulo(8,4);
		System.out.println("Area: " + bean.calcArea());
	
		
	}
}
