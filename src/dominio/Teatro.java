package dominio;

import java.sql.Time;
import java.sql.Timestamp;
import java.util.ArrayList;

public class Teatro extends Evento implements IGeneros{
	private final double precioGeneral=1350.5;
	private Genero genero;
	private ArrayList<String> actores;
	
	public Teatro() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Teatro(String nombreEvento, Timestamp ahora, Time duracionEvento) {
		super(nombreEvento, "Teatro", ahora, duracionEvento);
	}

	public Teatro(String nombreEvento, Timestamp ahora, Time duracionEvento,
			Genero genero, ArrayList<String> actores) {
		super(nombreEvento, "Teatro", ahora, duracionEvento);
		this.genero = genero;
		this.actores = actores;
	}
	@Override
	public void cargarGeneros() {
		// TODO Auto-generated method stub
		listaGeneros.add(new TipoGenero("Teatro", 1, "Drama"));
		listaGeneros.add(new TipoGenero("Teatro", 2, "Teatro"));
		listaGeneros.add(new TipoGenero("Teatro", 3, "Comedia"));
	}

	@Override
	public void mostrarGeneros() {
		// TODO Auto-generated method stub
		for(Genero i:listaGeneros) {
			System.out.println(i);
		}
	}


	@Override
	public String getNombreGenero(int idGenero) {
		// TODO Auto-generated method stub
		return listaGeneros.get(idGenero-1).getNombre();
	}
	
	public Genero getGenero(int idGenero) {
		return listaGeneros.get(idGenero-1);
	}

	public Genero getGenero() {
		return genero;
	}

	public void setGenero(Genero genero) {
		this.genero = genero;
	}

	public String getActores() {
		String cadenaActores="";
		for(String a:actores) {
			cadenaActores += a + ", ";
		}
		cadenaActores = cadenaActores.substring(0, cadenaActores.length()-2);
		return cadenaActores;
	}
	

	public void setActores(ArrayList<String> actores) {
		this.actores = actores;
	}

	public double getPrecioGeneral() {
		return precioGeneral;
	}

	@Override
	public String toString() {
		return "Detalles del Evento [numero=" + super.getNumero() +  ", tipoEvento=" + super.getTipoEvento() 
		+ ", nombreEvento=" + super.getNombreEvento() 
		+ ", diaHora=" + super.getDiaHora() + ", duracionEvento=" + super.getDuracionEvento() + "]"
		+ " Detalles de la obra de teatro [precioGeneral=" + precioGeneral + ", " + genero + ", actores=" + getActores() + "]";
	}
	
}
