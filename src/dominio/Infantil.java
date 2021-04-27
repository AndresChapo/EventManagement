package dominio;

import java.sql.Time;
import java.sql.Timestamp;

public class Infantil extends Evento{
	private final double precioMenorDe8 = 250;
	private final double precioMayorDe8 = 500;
	private boolean conSouvenir;
	
	public Infantil(String nombreEvento, Timestamp ahora, Time duracionEvento, boolean conSouvenir) {
		super(nombreEvento, "Infantil", ahora, duracionEvento);
		this.conSouvenir = conSouvenir;
	}

	public boolean isConSouvenir() {
		return conSouvenir;
	}

	public void setConSouvenir(boolean conSouvenir) {
		this.conSouvenir = conSouvenir;
	}

	public double getPrecioMenorDe8() {
		return precioMenorDe8;
	}

	public double getPrecioMayorDe8() {
		return precioMayorDe8;
	}

	@Override
	public String toString() {
		return "Detalles del Evento [numero=" + super.getNumero() +  ", tipoEvento=" + super.getTipoEvento() 
		+ ", nombreEvento=" + super.getNombreEvento() 
		+ ", diaHora=" + super.getDiaHora() + ", duracionEvento=" + super.getDuracionEvento() + "]" 
		+ " Detalles del Infantil [precioMenorDe8=" + precioMenorDe8 + ", precioMayorDe8=" + precioMayorDe8 + ", conSouvenir="
				+ conSouvenir + "]";
	}


	
}
