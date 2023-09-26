package pe.edu.uni.proyecto1_taipe.pruebas;

import pe.edu.uni.proyecto1_taipe.servicios.ServiciosTriangulo;
import pe.edu.uni.proyecto1_taipe.dto.TrianguloDto;

/**
 *
 * @author PROFESOR
 */
public class Prueba1 {

	/**
	 * @param args the command line arguments
	 */
	public static void main(String[] args) {
		//datos
		TrianguloDto dto = new TrianguloDto(4, 3, 5);
		//proceso
		ServiciosTriangulo servicio = new ServiciosTriangulo();
		servicio.determinavalidez(dto);
		if (dto.getValidez().equals("es valido")) {
			servicio.calculaPerimetro(dto);
			servicio.calculaArea(dto);
		}
		//reporte
		System.out.println("El triangulo " + dto.getValidez());
		System.out.println("El perimetro es: " + dto.getPerimetro());
		System.out.println("El area es: " + dto.getArea());
	}

}
