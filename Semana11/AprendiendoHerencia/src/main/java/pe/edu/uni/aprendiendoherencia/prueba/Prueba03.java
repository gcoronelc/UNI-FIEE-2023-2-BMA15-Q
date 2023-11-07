package pe.edu.uni.aprendiendoherencia.prueba;

import pe.edu.uni.aprendiendoherencia.demo2.AbstractMate;
import pe.edu.uni.aprendiendoherencia.demo2.Mate;

public class Prueba03 {
	
	public static void main(String[] args) {
		AbstractMate bean = new Mate();
		System.out.println("7! = " + bean.factorial(7));
	}

}
