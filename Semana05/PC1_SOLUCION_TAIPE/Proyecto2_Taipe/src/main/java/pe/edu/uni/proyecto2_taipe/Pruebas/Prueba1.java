package pe.edu.uni.proyecto2_taipe.Pruebas;

import pe.edu.uni.proyecto2_taipe.EcuacionDto.ecuacionDto;
import pe.edu.uni.proyecto2_taipe.Servicios.RaicesEcuacion;

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
		ecuacionDto dto = new ecuacionDto(1, 0, -4);
		//proceso
		RaicesEcuacion raices = new RaicesEcuacion();
		raices.determinaValidez(dto);
		if (dto.getCondicion() == "tiene raices reales") {
			raices.hallarRaices(dto);
		}
		//reporte
		System.out.println("" + dto.getCondicion());
		System.out.println("X1= " + dto.getX1());
		System.out.println("X2= " + dto.getX2());
	}

}
