package pe.edu.uni.aprendiendocolecciones.prueba;

import pe.edu.uni.aprendiendocolecciones.dto.AlumnoDto;
import pe.edu.uni.aprendiendocolecciones.listaalumnos.ListaAlumnoImpl1;
import pe.edu.uni.aprendiendocolecciones.listaalumnos.ListaAlumnosSpec;


public class Prueba02 {
	
	public static void main(String[] args) {
		ListaAlumnosSpec lista = new ListaAlumnoImpl1();
		
		AlumnoDto[] arreglo1 = lista.getAlumnos();
		
		mostrarLista("Lista A: ", arreglo1);
	}

	private static void mostrarLista(String titulo, AlumnoDto[] arreglo) {
		System.out.println(titulo);
		for (AlumnoDto dto : arreglo) {
			System.out.println(" - " + dto.toString());
		}
	}

}
