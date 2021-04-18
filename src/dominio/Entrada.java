package dominio;

import java.sql.Time;
import java.sql.Timestamp;

public class Entrada {
	private int idEntrada;
	private int idEvento;
	private Evento evento;
	private float precio;
	private String categoria;
	private static int cont = 0;
	
	public Entrada(int idEvento, Evento evento, float precio, String categoria) {
		super();
		cont++;
		this.idEntrada = cont;
		this.idEvento = idEvento;
		this.evento = evento;
		this.precio = precio;
		this.categoria = categoria;
	}

	@Override
	public String toString() {
		return "Entrada [idEntrada=" + idEntrada + ", idEvento=" + idEvento + ", evento=" + evento + ", precio="
				+ precio + ", categoria=" + categoria + "]";
	}
}
//vip/gral/edad - recital
