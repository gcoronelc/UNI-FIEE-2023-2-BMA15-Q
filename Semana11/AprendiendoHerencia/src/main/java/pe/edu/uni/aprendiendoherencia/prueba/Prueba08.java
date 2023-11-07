package pe.edu.uni.aprendiendoherencia.prueba;

import pe.edu.uni.aprendiendoherencia.demo3.FiguraAbstract;
import pe.edu.uni.aprendiendoherencia.demo3.Rombo;


public class Prueba08 {
	public static void main(String[] args) {
		Rombo bean = new Rombo();
		bean.setDiag1(4.0);
		bean.setDiag2(5.0);
		System.out.println("Area: "+bean.calcArea());
	}
}
