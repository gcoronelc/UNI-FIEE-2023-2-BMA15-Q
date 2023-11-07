package pe.edu.uni.aprendiendoherencia.prueba;

import pe.edu.uni.aprendiendoherencia.demo3.Circulo;
import pe.edu.uni.aprendiendoherencia.demo3.FiguraAbstract;

public class Prueba07 {
	
	public static void main(String[] args) {
		FiguraAbstract bean = new Circulo(6);
		System.out.println("Área: " + bean.calcArea());
	}
}
