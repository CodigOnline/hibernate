package entities;

import javax.persistence.*;

@Entity(name = "alumnos")
public class Alumno {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "alumno_id")
	private Long alumnoId;

	private String nombre;
	private int edad;

	public Alumno(String nombre, int edad) {
		this.nombre = nombre;
		this.edad = edad;
	}

	public Alumno() {
	}

	public Long getAlumnoId() {
		return alumnoId;
	}

	public void setAlumnoId(Long alumnoId) {
		this.alumnoId = alumnoId;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	@Override
	public String toString() {
		return "Alumno{" + "alumnoId=" + alumnoId + ", nombre='" + nombre + '\'' + ", edad=" + edad + '}';
	}
}
