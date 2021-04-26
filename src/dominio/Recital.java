package dominio;

import java.sql.Time;
import java.sql.Timestamp;

public class Recital extends Evento implements IGeneros{
	//Atributes
	private String bandaPricipal;
	private String bandaSoporte1;
	private String bandaSoporte2;
	private Genero genero;
	private final double precioEntradaVip;
	private final double precioEntradaGeneral;
	
	
	@Override
	public void cargarGeneros() {
		// TODO Auto-generated method stub
		listaGeneros.add(new TipoGenero("Recital", 1, "Rock"));
		listaGeneros.add(new TipoGenero("Recital", 2, "Heavy Metal"));
		listaGeneros.add(new TipoGenero("Recital", 3, "Reggaetón"));
		listaGeneros.add(new TipoGenero("Recital", 4, "Trap"));
		listaGeneros.add(new TipoGenero("Recital", 5, "Latino"));
		listaGeneros.add(new TipoGenero("Recital", 6, "Pop"));
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
		//generox = listaGeneros.get(idGenero-1).getNombre();

		return listaGeneros.get(idGenero-1).getNombre();
	}
	
	public Genero getGenero(int idGenero) {
		return listaGeneros.get(idGenero-1);
	}

	//Constructors
	public Recital() {
		super();
		super.setTipoEvento("Recital");
		cargarGeneros();
		bandaPricipal = "";
		bandaSoporte1 = "";
		bandaSoporte2 = "";
		genero = new TipoGenero();
		precioEntradaVip = 1500;
		precioEntradaGeneral = 800;
	}

	public Recital(String nombreEvento , Timestamp ahora,
			Time duracionEvento, String bandaPricipal, String bandaSoporte1, String bandaSoporte2, String idGenero) {
		super(nombreEvento, "Recital",ahora, duracionEvento);
		//this.vip = categoria;
		cargarGeneros();
		this.bandaPricipal = bandaPricipal;
		this.bandaSoporte1 = bandaSoporte1;
		this.bandaSoporte2 = bandaSoporte2;
		this.genero = getGenero(Integer.parseInt(idGenero));
		this.precioEntradaVip = 1500;
		this.precioEntradaGeneral = 800;

	}


	@Override
	public String toString() {
		return "Detalles del Evento [numero=" + super.getNumero() +  ", tipoEvento=" + super.getTipoEvento() 
				+ ", nombreEvento=" + super.getNombreEvento() 
				+ ", diaHora=" + super.getDiaHora() + ", duracionEvento=" + super.getDuracionEvento() + "]" 
				+ " Detalles del Recital [bandaPricipal=" + bandaPricipal + ", bandaSoporte1="
				+ bandaSoporte1 + ", bandaSoporte2=" + bandaSoporte2 + ", " + genero + ", precioEntradaVip="
				+ precioEntradaVip + ", precioEntradaGeneral=" + precioEntradaGeneral + "]";
	}
}
