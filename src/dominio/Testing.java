package dominio;

import java.sql.Time;
import java.sql.Timestamp;
import java.util.ArrayList;

public class Testing {

	public Testing() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Evento nuevoRecital() {
		Timestamp ahora = new Timestamp(System.currentTimeMillis());
		Time duracion = new Time(2, 30, 0);
		
		Evento eve = new Recital("Rock en las rocas", ahora, duracion,
				"Guns n Roses", "Led Zeppelin", "Kiss", "2");
		System.out.println(eve);
		return eve;
	}
	
	public Evento nuevoTeatro() {
		Timestamp ahora = new Timestamp(System.currentTimeMillis());
		Time duracion = new Time(2, 30, 0);
		
		ArrayList<String> actores = new ArrayList<String>();
		actores.add("Andy Creed");
		actores.add("Ale Scalada");

		Evento eve = new Teatro("Shakespiere", ahora, duracion,
				new TipoGenero("Teatro",1,"Drama"), actores);
		System.out.println(eve);
		return eve;
	}
	
	public Evento nuevoInfantil() {
		Timestamp ahora = new Timestamp(System.currentTimeMillis());
		Time duracion = new Time(1, 0, 0);

		Evento eve = new Infantil("Show de payasos", ahora, duracion,true);
		System.out.println(eve);
		return eve;
	}
	
	public Evento nuevoDeportivo() {
		Timestamp ahora = new Timestamp(System.currentTimeMillis());
		Time duracion = new Time(1, 0, 0);
		Deporte futbol = new Deporte(1,"Futbol",300);

		Evento eve = new Deportivo("Supercampeones", ahora, duracion,futbol,true);
		System.out.println(eve);
		return eve;
	}
	
	public Entrada nuevaEntradaRecital(Evento eve) {
		Timestamp ahora = new Timestamp(System.currentTimeMillis());
		Time duracion = new Time(2, 30, 0);
		
		Entrada ticket = new Entrada(eve.getNumero(), eve, 123, "VIP");
		System.out.println(ticket);
		return ticket;
	}

}
