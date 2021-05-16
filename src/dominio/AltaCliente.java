package dominio;

import java.sql.Time;
import java.sql.Timestamp;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.ArrayList;

public class AltaCliente {
	private String opcion = "";
	Scanner in = new Scanner(System.in);
	
	public Cliente CargarCliente(int dni){
		Cliente c = new Cliente();
		if(dni != -1) {
			c.setDni(dni);
		} else {
			System.out.println("Ingrese su DNI: ");
			c.setDni(Integer.parseInt(in.nextLine()));
		}
		System.out.println("Ingrese su Nombre: ");
		c.setNombre(in.nextLine());
		System.out.println("Ingrese su Apellido: ");
		c.setApellido(in.nextLine());
		System.out.println("Ingrese su Genero: ");
		c.setGenero(in.nextLine());
		System.out.println("Ingrese su Direccion: ");
		c.setDireccion(in.nextLine());
		System.out.println("Ingrese la Localidad: ");
		c.setLocalidad(in.nextLine());
		System.out.println("Ingrese la Provincia: ");
		c.setProvincia(in.nextLine());
		System.out.println("Se ha cargado el cliente ");
		return c;
	}
}
