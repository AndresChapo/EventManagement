package dominio;

public class Genero {

	private int idGenero;
	private String nombre;
	
	public Genero() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Genero(int idGenero, String nombre) {
		super();
		this.idGenero = idGenero;
		this.nombre = nombre;
	}

	public int getIdGenero() {
		return idGenero;
	}

	public void setIdGenero(int idGenero) {
		this.idGenero = idGenero;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	@Override
	public String toString() {
		return "Genero [idGenero=" + idGenero + ", nombre=" + nombre + "]";
	}
	
}
