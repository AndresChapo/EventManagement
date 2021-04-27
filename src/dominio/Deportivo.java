package dominio;

import java.sql.Time;
import java.sql.Timestamp;

public class Deportivo extends Evento{
	private Deporte deporte;
	private boolean internacional;
	

	public Deportivo(String nombreEvento, Timestamp ahora, Time duracionEvento,Deporte deporte, boolean internacional) {
		super(nombreEvento, "Deportivo", ahora, duracionEvento);
		this.deporte = deporte;
		this.internacional = internacional;
	}

	public Deporte getDeporte() {
		return deporte;
	}

	public void setDeporte(Deporte deporte) {
		this.deporte = deporte;
	}

	public boolean isInternacional() {
		return internacional;
	}

	public void setInternacional(boolean internacional) {
		this.internacional = internacional;
	}

	@Override
	public String toString() {
		return "Detalles del Evento [numero=" + super.getNumero() +  ", tipoEvento=" + super.getTipoEvento() 
		+ ", nombreEvento=" + super.getNombreEvento() 
		+ ", diaHora=" + super.getDiaHora() + ", duracionEvento=" + super.getDuracionEvento() + "]" 
		+ " Detalles del evento deportivo [" + deporte + ", internacional=" + internacional + "]";
	}

	
}
