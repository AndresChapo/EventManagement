package dominio;

import java.sql.Time;
import java.sql.Timestamp;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.ArrayList;

public class VentaEntrada {
	private String opcion = "";
	Scanner in = new Scanner(System.in);

	public Venta generarVenta(LinkedList<Evento> ListEvent, LinkedList<Cliente> clientes, int idVenta, LinkedList<Entrada> listaEntradas){
		int dni , idEvento = 0;
		boolean clienteEncontrado = false;
		Venta v = new Venta();
		System.out.println("Ingrese su DNI: ");
		dni = Integer.parseInt(in.nextLine()); 
		for(Cliente cliente: clientes) {
		if(dni == cliente.getDni()) {
			clienteEncontrado = true;
		}
		}
		if(clienteEncontrado) {
			v.setDni(dni);
		} else {
			System.out.println("No se encontro ningun cliente cargado con ese DNI ");
			System.out.println("Desea registrarse ?");
			while(opcion != "") {
			opcion = in.nextLine();
			if(opcion == "si") {
				AltaCliente ac = new AltaCliente();
				ac.CargarCliente(dni);
			} else if(opcion == "no") {
				break;
			} else {
				opcion = "";
			}
		}
		}
		while(opcion !=  "0"){
			System.out.println("Seleccione el evento deseado: ");
			for (Evento eve: ListEvent){
				System.out.println(eve.getNumero() +". "+ eve.getNombreEvento());
			}
			opcion = in.nextLine(); //////////////// FALTA VALIDAR !!
			idEvento = Integer.parseInt(opcion) - 1;
			if (idEvento > -1 && idEvento < (ListEvent.size())) {
				v.setIdEvento(idEvento+1);
				opcion ="0";
			}
			else {
				System.out.println("Datos invalidos!");	
			}
		}
		
		while(opcion !=  "0"){
			System.out.println("Seleccione el evento deseado: ");
			for (Evento eve: ListEvent){
				System.out.println(eve.getNumero() +". "+ eve.getNombreEvento());
			}
			opcion = in.nextLine(); //////////////// FALTA VALIDAR !!
			idEvento = Integer.parseInt(opcion) - 1;
			if (idEvento > -1 && idEvento < (ListEvent.size())) {
				v.setIdEvento(idEvento+1);
				opcion ="0";
			}
			else {
				System.out.println("Datos invalidos!");	
			}
		}
		v.setIdVenta(idVenta);
		while(opcion !=  "0"){
			System.out.println("Seleccione el evento deseado: ");
			for (Evento eve: ListEvent){
				System.out.println(eve.getNumero() +". "+ eve.getNombreEvento());
			}
			opcion = in.nextLine(); //////////////// FALTA VALIDAR !!
			idEvento = Integer.parseInt(opcion) - 1;
			if (idEvento > -1 && idEvento < (ListEvent.size())) {
				v.setIdEvento(idEvento+1);
				opcion ="0";
			}
			else {
				System.out.println("Datos invalidos!");	
			}
		}
		
		for (Entrada ent: listaEntradas){
			if(ent.getIdEvento() == idEvento){
			v.setIdEntrada(ent.getIdEntrada());
			v.setPrecio(ent.getPrecio());
			}
		}
		return v;
	}
	
}
