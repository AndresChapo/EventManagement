package dominio;

import java.sql.Time;
import java.sql.Timestamp;

public class Recital extends Evento{
	//Atributes
	//private boolean vip;
	private String bandaPricipal;
	private String bandaSoporte1;
	private String bandaSoporte2;
	private String genero;
	private double precioEntradaVip;
	private double precioEntradaGeneral;
	
	
	//Constructors
	public Recital() {
		super();
		super.setTipoEvento("Recital");
		//vip = false;
		bandaPricipal = "";
		bandaSoporte1 = "";
		bandaSoporte2 = "";
		genero = "";
		precioEntradaVip = 0;
		precioEntradaGeneral = 0;
	}

	public Recital(String nombreEvento , Timestamp ahora,
			Time duracionEvento, String bandaPricipal, String bandaSoporte1, String bandaSoporte2, String genero,
			double precioEntradaVip, double precioEntradaGeneral) {
		super(nombreEvento, "Recital",ahora, duracionEvento);
		//this.vip = categoria;
		this.bandaPricipal = bandaPricipal;
		this.bandaSoporte1 = bandaSoporte1;
		this.bandaSoporte2 = bandaSoporte2;
		this.genero = genero;
		this.precioEntradaVip = precioEntradaVip;
		this.precioEntradaGeneral = precioEntradaGeneral;
	}


	@Override
	public String toString() {
		return super.toString() + " Recital [bandaPricipal=" + bandaPricipal + ", bandaSoporte1="
				+ bandaSoporte1 + ", bandaSoporte2=" + bandaSoporte2 + ", genero=" + genero + ", precioEntradaVip="
				+ precioEntradaVip + ", precioEntradaGeneral=" + precioEntradaGeneral + "]";
	}
}
