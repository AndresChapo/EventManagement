package dominio;

import java.util.LinkedList;

public interface IGeneros {
	LinkedList<TipoGenero> listaGeneros = new LinkedList<TipoGenero>();
	
	public void cargarGeneros();
	public void mostrarGeneros();
	public String getNombreGenero(int idGenero);
	public Genero getGenero(int idGenero);
}
