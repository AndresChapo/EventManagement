package dominio;

public class Venta {
	
	private int idVenta;
	private int idEntrada;
	private int dni;
	private int idEvento;
	private int CantEntrada;
	private double precio;
	
	public Venta() {
		
	}
	
	public int getIdEntrada() {
		return idEntrada;
	}
	public void setIdEntrada(int idEntrada) {
		this.idEntrada = idEntrada;
	}

	public int getIdVenta() {
		return idVenta;
	}
	public void setIdVenta(int idVenta) {
		this.idVenta = idVenta;
	}
	public int getDni() {
		return dni;
	}
	public void setDni(int dni) {
		this.dni = dni;
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

	public int getCantEntrada() {
		return CantEntrada;
	}

	public void setCantEntrada(int cantEntrada) {
		CantEntrada = cantEntrada;
	}

	@Override
	public String toString() {
		return "Venta [idVenta=" + idVenta + ", idEntrada=" + idEntrada + ", dni=" + dni + ", idEvento=" + idEvento
				+ ", CantEntrada=" + CantEntrada + ", precio=" + precio + "]";
	}
	
	
	
}
