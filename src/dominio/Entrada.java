package dominio;

import java.sql.Time;
import java.sql.Timestamp;

public class Entrada implements Comparable<Entrada>{
	private int idEntrada;
	private int idEvento;
	private double precio;
	private String categoria;
	private static int cont = 0;
	
	public Entrada(int idEvento, double precio, String categoria) {
		super();
		cont++;
		this.idEntrada = cont;
		this.idEvento = idEvento;
		this.precio = precio;
		this.categoria = categoria;
	}
	
	public Entrada() {
		super();
		cont++;
		this.idEntrada = cont;
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

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
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

	@Override
	public int compareTo(Entrada o) {

		return idEntrada - o.getIdEntrada();
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((categoria == null) ? 0 : categoria.hashCode());
		result = prime * result + idEntrada;
		result = prime * result + idEvento;
		long temp;
		temp = Double.doubleToLongBits(precio);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Entrada other = (Entrada) obj;
		if (categoria == null) {
			if (other.categoria != null)
				return false;
		} else if (!categoria.equals(other.categoria))
			return false;
		if (idEntrada != other.idEntrada)
			return false;
		if (idEvento != other.idEvento)
			return false;
		if (Double.doubleToLongBits(precio) != Double.doubleToLongBits(other.precio))
			return false;
		return true;
	}

}
//vip/gral/edad - recital
