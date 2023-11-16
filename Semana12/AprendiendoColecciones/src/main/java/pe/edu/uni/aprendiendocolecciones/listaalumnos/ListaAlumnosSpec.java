package pe.edu.uni.aprendiendocolecciones.listaalumnos;

import pe.edu.uni.aprendiendocolecciones.dto.AlumnoDto;

public interface ListaAlumnosSpec {
	
	void add(AlumnoDto bean);
	
	AlumnoDto[] getAlumnos();
	
	AlumnoDto findById(int id);
	
	void delete(int id);
	
	
}
