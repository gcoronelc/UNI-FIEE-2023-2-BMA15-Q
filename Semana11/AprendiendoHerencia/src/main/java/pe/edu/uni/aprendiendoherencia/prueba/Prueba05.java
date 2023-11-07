package pe.edu.uni.aprendiendoherencia.prueba;

import pe.edu.uni.aprendiendoherencia.demo3.Cuadrado;
import pe.edu.uni.aprendiendoherencia.demo3.FiguraAbstract;

public class Prueba05 {

	public static void main(String[] args) {
		FiguraAbstract bean = new Cuadrado(8.0);
		System.out.println("Area: " + bean.calcArea());
	}
}
