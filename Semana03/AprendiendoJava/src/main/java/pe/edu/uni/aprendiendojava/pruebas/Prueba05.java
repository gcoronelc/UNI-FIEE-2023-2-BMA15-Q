package pe.edu.uni.aprendiendojava.pruebas;

import pe.edu.uni.aprendiendojava.model.ProductoModel;

/**
 *
 * @author Gustavo Coronel
 */
public class Prueba05 {

	public static void main(String[] args) {
		ProductoModel prod1 = new ProductoModel();
		System.out.println("Codigo: " + prod1.getCodigo());
		System.out.println("Nombre: " + prod1.getNombre());
		System.out.println("Stock: " + prod1.getStock());
		System.out.println("Precio: " + prod1.getPrecio());
		System.out.println("Activo: " + prod1.isActivo());
		
		ProductoModel prod2 = new ProductoModel(55, "Laptop", 50, 6789.99, true);
		System.out.println("-----------------------------------------");
		System.out.println("Codigo: " + prod2.getCodigo());
		System.out.println("Nombre: " + prod2.getNombre());
		System.out.println("Stock: " +  prod2.getStock());
		System.out.println("Precio: " + prod2.getPrecio());
		System.out.println("Activo: " + prod2.isActivo());
	}
}
