package dominio;

import java.sql.Time;
import java.sql.Timestamp;

public class Recital extends Evento{
	//Atributes
	private String categoria;
	private String bandaPricipal;
	private String bandaSoporte1;
	private String bandaSoporte2;
	private String genero;
	private double precioEntradaVip;
	private double precioEntradaGeneral;
	
	
	//Constructors
	public Recital() {
		super();
		categoria = "";
		bandaPricipal = "";
		bandaSoporte1 = "";
		bandaSoporte2 = "";
		genero = "";
		precioEntradaVip = 0;
		precioEntradaGeneral = 0;
	}

	public Recital(String nombreEvento, String tipoEvento, Timestamp ahora,
			Time duracionEvento, String categoria, String bandaPricipal, String bandaSoporte1, String bandaSoporte2, String genero,
			double precioEntradaVip, double precioEntradaGeneral) {
		super(nombreEvento, tipoEvento, ahora, duracionEvento);
		this.categoria = categoria;
		this.bandaPricipal = bandaPricipal;
		this.bandaSoporte1 = bandaSoporte1;
		this.bandaSoporte2 = bandaSoporte2;
		this.genero = genero;
		this.precioEntradaVip = precioEntradaVip;
		this.precioEntradaGeneral = precioEntradaGeneral;
	}


	@Override
	public String toString() {
		return super.toString() + "Recital [categoria=" + categoria + ", bandaPricipal=" + bandaPricipal + ", bandaSoporte1="
				+ bandaSoporte1 + ", bandaSoporte2=" + bandaSoporte2 + ", genero=" + genero + ", precioEntradaVip="
				+ precioEntradaVip + ", precioEntradaGeneral=" + precioEntradaGeneral + "]";
	}
}
