package dominio;

import java.util.ArrayList;

public class Deporte{
	private int idDeporte;
	private String nombre;
	private double precio;
	
	public Deporte(int idDeporte, String nombre, double precio) {
		super();
		this.idDeporte = idDeporte;
		this.nombre = nombre;
		this.precio = precio;
	}
	
	public Deporte() {
		super();
	}

	public int getIdDeporte() {
		return idDeporte;
	}

	public void setIdDeporte(int idDeporte) {
		this.idDeporte = idDeporte;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	@Override
	public String toString() {
		return " Deporte [idDeporte=" + idDeporte + ", nombre=" + nombre + ", precio=" + precio + "]";
	}
	
}
