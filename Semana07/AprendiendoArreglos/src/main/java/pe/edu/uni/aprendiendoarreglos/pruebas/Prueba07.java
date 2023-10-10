package pe.edu.uni.aprendiendoarreglos.pruebas;

import java.util.Random;
import pe.edu.uni.aprendiendoarreglos.dto.Producto;

/**
 *
 * @author Gustavo Coronel
 */
public class Prueba07 {

    public static void main(String[] args) {
        
		 Object arreglo[] = new Object[5];
		 
		 arreglo[0] = 78;
		 arreglo[1] = 68.6;
		 arreglo[2] = "Gustavo";
		 arreglo[3] = new Random();
		 arreglo[4] = new Producto(10, "Laptop", 4589.50);
		  
		 
		 for (int i = 0; i < arreglo.length; i++) {
			 System.out.println(arreglo[i]);
		 }
		  
    }

}
