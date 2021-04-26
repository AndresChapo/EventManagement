package dominio;

import java.sql.Time;
import java.sql.Timestamp;

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
	
	public Entrada nuevaEntradaRecital(Evento eve) {
		Timestamp ahora = new Timestamp(System.currentTimeMillis());
		Time duracion = new Time(2, 30, 0);
		
		Entrada ticket = new Entrada(eve.getNumero(), eve, 123, "VIP");
		System.out.println(ticket);
		return ticket;
	}
}
