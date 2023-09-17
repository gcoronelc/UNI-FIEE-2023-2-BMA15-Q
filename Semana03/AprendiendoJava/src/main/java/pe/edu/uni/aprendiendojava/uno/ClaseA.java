package pe.edu.uni.aprendiendojava.uno;

/**
 *
 * @author Gustavo Coronel
 */
public class ClaseA {

	/**
	 * Variables de la clase
	 */
	private int n1;
	int n2;
	protected int n3;
	public int n4;

	/**
	 * Constructor por defecto
	 */
	public ClaseA() {
		this.n1 = 10;
		this.n2 = 20;
		this.n3 = 30;
		this.n4 = 40;
	}

	/**
	 * Metodo que muestra el valor de las variables
	 */
	public void metodoA(){
		System.out.println("n1: " + n1);
		System.out.println("n2: " + n2);
		System.out.println("n3: " + n3);
		System.out.println("n4: " + n4);
	}
}
