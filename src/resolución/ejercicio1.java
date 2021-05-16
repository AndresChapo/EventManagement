package resolución;

import java.sql.Time;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.LinkedList;

import dominio.Deportivo;
import dominio.Entrada;
import dominio.Evento;
import dominio.Tipos;

//Crear un main llamado ejercicio1. Dentro de este main crear 5 entradas
//y guardarlas dentro de un ArrayList. Mostrar las entradas guardadas en
//el ArrayList con un iterador.

public class ejercicio1 {

	public static void main(String[] args) {
		Timestamp ahora = new Timestamp(System.currentTimeMillis());
		Time duracion = new Time(2, 30, 0);
		Tipos tipos = new Tipos();
		
		Deportivo eve = new Deportivo("Supercampeones", ahora, duracion,tipos.getDeporte(1),true);
		
		Entrada ticket1 = new Entrada(eve.getNumero(), eve.getDeporte().getPrecio(), eve.getDeporte().getNombre() +" Internacional");
		Entrada ticket2 = new Entrada(eve.getNumero(), eve.getDeporte().getPrecio(), eve.getDeporte().getNombre() +" Internacional");
		Entrada ticket3 = new Entrada(eve.getNumero(), eve.getDeporte().getPrecio(), eve.getDeporte().getNombre() +" Internacional");
		Entrada ticket4 = new Entrada(eve.getNumero(), eve.getDeporte().getPrecio(), eve.getDeporte().getNombre() +" Internacional");
		Entrada ticket5 = new Entrada(eve.getNumero(), eve.getDeporte().getPrecio(), eve.getDeporte().getNombre() +" Internacional");
		
		ArrayList<Entrada> listaEntradas = new ArrayList<Entrada>(); 
		listaEntradas.add(ticket1);
		listaEntradas.add(ticket3);
		listaEntradas.add(ticket2);
		listaEntradas.add(ticket5);	
		listaEntradas.add(ticket4);

		System.out.println("Ejercicio 1 - a:");
		for (Entrada e: listaEntradas) {
			System.out.println(e);
		}
		
	}

}
