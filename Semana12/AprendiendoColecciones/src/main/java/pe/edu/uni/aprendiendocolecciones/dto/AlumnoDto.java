package pe.edu.uni.aprendiendocolecciones.dto;

public class AlumnoDto {

	private int id;
	private String nombre;
	private int nota;

	public AlumnoDto() {
	}

	public AlumnoDto(int id, String nombre, int nota) {
		this.id = id;
		this.nombre = nombre;
		this.nota = nota;
	}

	public AlumnoDto(String nombre, int nota) {
		this.id = 0;
		this.nombre = nombre;
		this.nota = nota;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getNota() {
		return nota;
	}

	public void setNota(int nota) {
		this.nota = nota;
	}

	@Override
	public String toString() {
		String repo = "[ID:" + id + ",NOMBRE:" + nombre + ",NOTA:" + nota + "]";
		return repo;
	}

	
			  
}
