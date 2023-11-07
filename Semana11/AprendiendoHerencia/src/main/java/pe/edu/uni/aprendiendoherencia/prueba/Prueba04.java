package pe.edu.uni.aprendiendoherencia.prueba;

import pe.edu.uni.aprendiendoherencia.demo2.AbstractMate;

public class Prueba04 {

	public static void main(String[] args) {
		AbstractMate bean = new AbstractMate() {
			@Override
			public long factorial(int n) {
				if(n==1 || n==0){
					return 1;
				}
				return n*factorial(n-1);
			}
		};
		System.out.println("5! = " + bean.factorial(5));
	}
	
}
