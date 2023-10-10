package pe.edu.uni.aprendiendoarreglos.pruebas;

/**
 *
 * @author Gustavo Coronel
 */
public class Prueba02 {

    public static void main(String[] args) {
        
		 Integer arreglo[] = new Integer[5];
		 
		 arreglo[0] = 78;
		 arreglo[1] = 68;
		 arreglo[2] = 58;
		 arreglo[3] = 71;
		 arreglo[4] = 74;
		  
		 
		 for (Integer dato : arreglo) {
			 System.out.println(dato);
		 }
		 
		 System.out.println("---------------");
		 
		 for (int i = 0; i < arreglo.length; i++) {
			 System.out.println(arreglo[i]);
		 }
		  
    }

}
