package entities;

public class Modulo {
	private long moduloId;
	private String nombre;
	private String abreviatura;

	public Modulo() {
	}

	public Modulo(String nombre, String abreviatura) {
		this.nombre = nombre;
		this.abreviatura = abreviatura;
	}

	public long getModuloId() {
		return moduloId;
	}

	public void setModuloId(long moduloId) {
		this.moduloId = moduloId;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getAbreviatura() {
		return abreviatura;
	}

	public void setAbreviatura(String abreviatura) {
		this.abreviatura = abreviatura;
	}

	@Override
	public String toString() {
		return "Modulo{" + "moduloId=" + moduloId + ", nombre='" + nombre + '\'' + ", abreviatura='" + abreviatura + '\'' + '}';
	}
}
