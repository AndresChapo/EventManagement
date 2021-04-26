package dominio;

import java.sql.Timestamp;
import java.sql.Time;

public abstract class Evento {
	
	//Attributes
	private int numero;
	private String nombreEvento;
	private String tipoEvento;
	private Timestamp diaHora;
	private Time duracionEvento;
	private static int cont=0;
	
	@Override
	public abstract String toString();
	
	//Constructors
	public Evento()
	{
		cont++;
		this.numero = cont;
		this.nombreEvento ="";
		this.tipoEvento = "";
		this.diaHora = null;
		this.duracionEvento = null;
		
	}

	public Evento(String nombreEvento, String tipoEvento, Timestamp ahora,
			Time duracionEvento) {
		super();
		cont++;
		this.numero = cont;
		this.nombreEvento = nombreEvento;
		this.tipoEvento = tipoEvento;
		this.diaHora = ahora;
		this.duracionEvento = duracionEvento;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public String getNombreEvento() {
		return nombreEvento;
	}

	public void setNombreEvento(String nombreEvento) {
		this.nombreEvento = nombreEvento;
	}

	public String getTipoEvento() {
		return tipoEvento;
	}

	public void setTipoEvento(String tipoEvento) {
		this.tipoEvento = tipoEvento;
	}

	public Timestamp getDiaHora() {
		return diaHora;
	}

	public void setDiaHora(Timestamp diaHora) {
		this.diaHora = diaHora;
	}

	public Time getDuracionEvento() {
		return duracionEvento;
	}

	public void setDuracionEvento(Time duracionEvento) {
		this.duracionEvento = duracionEvento;
	}
	
}
