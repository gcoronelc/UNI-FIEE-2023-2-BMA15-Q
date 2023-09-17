package pe.edu.uni.aprendiendojava.dos;

import pe.edu.uni.aprendiendojava.uno.ClaseA;

/**
 *
 * @author Gustavo Coronel
 */
public class ClaseC extends ClaseA{

	public void metodoC(){
		ClaseA bean = new ClaseA();
		// System.out.println("n1: " + bean.n1);
		// System.out.println("n2: " + bean.n2);
		System.out.println("n3: " + super.n3);
		System.out.println("n4: " + bean.n4);
	}
}
