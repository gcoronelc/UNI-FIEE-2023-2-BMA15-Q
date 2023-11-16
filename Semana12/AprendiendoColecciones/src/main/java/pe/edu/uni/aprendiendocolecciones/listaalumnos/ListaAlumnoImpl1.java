package pe.edu.uni.aprendiendocolecciones.listaalumnos;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import pe.edu.uni.aprendiendocolecciones.dto.AlumnoDto;

public class ListaAlumnoImpl1 implements ListaAlumnosSpec {

	private static final List<AlumnoDto> lista;
	private static final int cont;

	static {
		lista = new ArrayList<>();
		lista.add(new AlumnoDto(1,"Gustavo", 20));
		lista.add(new AlumnoDto(2,"Karla", 18));
		lista.add(new AlumnoDto(3,"Ricardo", 16));
		lista.add(new AlumnoDto(4,"Alejandra", 19));
		cont = 4;
	}

	@Override
	public void add(AlumnoDto bean) {
		throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
	}

	@Override
	public AlumnoDto[] getAlumnos() {
		return lista.toArray(new AlumnoDto[0]);
	}

	@Override
	public AlumnoDto findById(int id) {
		throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
	}

	@Override
	public void delete(int id) {
		throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
	}

}
