package resolución;

import java.sql.Time;
import java.sql.Timestamp;
import java.util.TreeSet;

import dominio.Deportivo;
import dominio.Entrada;
import dominio.Tipos;

/*
b. Crear un main llamado ejercicio2. Dentro de este main crear 5 entradas
y guardarlas dentro de un TreeSet. Mostrar las entradas guardadas en el
Treeset con un iterador.
c. Dentro el main de ejerciocio2. Crear dos entradas con los mismos datos
y comparar ambos objetos mediante un IF. Si ambas entradas tienen los
mismos datos entonces mostrar por consola “Entradas iguales”.
*/

public class ejercicio2 {

	public static void main(String[] args) {
		Timestamp ahora = new Timestamp(System.currentTimeMillis());
		Time duracion = new Time(2, 30, 0);
		Tipos tipos = new Tipos();
		
		Deportivo eve = new Deportivo("Supercampeones", ahora, duracion,tipos.getDeporte(1),false);
		
		Entrada ticket1 = new Entrada(eve.getNumero(), eve.getDeporte().getPrecio(), eve.getDeporte().getNombre() +" Nacional");
		Entrada ticket2 = new Entrada(eve.getNumero(), eve.getDeporte().getPrecio(), eve.getDeporte().getNombre() +" Nacional");
		Entrada ticket3 = new Entrada(eve.getNumero(), eve.getDeporte().getPrecio(), eve.getDeporte().getNombre() +" Nacional");
		Entrada ticket4 = new Entrada(eve.getNumero(), eve.getDeporte().getPrecio(), eve.getDeporte().getNombre() +" Nacional");
		Entrada ticket5 = new Entrada(eve.getNumero(), eve.getDeporte().getPrecio(), eve.getDeporte().getNombre() +" Nacional");
		
		TreeSet<Entrada> listaEntradas = new TreeSet<Entrada>(); 
		listaEntradas.add(ticket1);
		listaEntradas.add(ticket3);
		listaEntradas.add(ticket2);
		listaEntradas.add(ticket5);	
		listaEntradas.add(ticket4);

		System.out.println("Ejercicio 2 - b:");
		for (Entrada e: listaEntradas) {
			System.out.println(e);
		}
		
		System.out.println("-------------------------------------");
		System.out.println("Ejercicio 2 - c:");
		ticket5.setIdEntrada(1);
		System.out.println(ticket5);
		System.out.println(ticket1);
		
		if(ticket1.equals(ticket5)) {
			System.out.println("Entradas iguales");
		}else {
			System.out.println("Entradas diferentes");
		}
	}

}
