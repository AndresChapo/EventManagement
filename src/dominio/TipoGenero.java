package dominio;

public class TipoGenero extends Genero{
	private String tipoGenero;

	public TipoGenero() {
		super();
		// TODO Auto-generated constructor stub
	}

	public TipoGenero(String tipoGenero, int idGenero, String nombre) {
		super(idGenero, nombre);
		this.tipoGenero = tipoGenero;
		// TODO Auto-generated constructor stub
	}
	
}
