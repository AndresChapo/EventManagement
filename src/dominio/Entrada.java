package dominio;

import java.sql.Time;
import java.sql.Timestamp;

public class Entrada {
	private int idEntrada;
	private int idEvento;
	private float precio;
	private String categoria;
	private static int cont = 0;
	
	public Entrada(int idEvento, float precio, String categoria) {
		super();
		cont++;
		this.idEntrada = cont;
		this.idEvento = idEvento;
		this.precio = precio;
		this.categoria = categoria;
	}
	
	public Entrada() {
		super();
	}
	
	

	public int getIdEntrada() {
		return idEntrada;
	}

	public void setIdEntrada(int idEntrada) {
		this.idEntrada = idEntrada;
	}

	public int getIdEvento() {
		return idEvento;
	}

	public void setIdEvento(int idEvento) {
		this.idEvento = idEvento;
	}

	public float getPrecio() {
		return precio;
	}

	public void setPrecio(float precio) {
		this.precio = precio;
	}

	public String getCategoria() {
		return categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}

	@Override
	public String toString() {
		return "Entrada [idEntrada=" + idEntrada + ", idEvento=" + idEvento + ", precio="
				+ precio + ", categoria=" + categoria + "]";
	}
}
//vip/gral/edad - recital
