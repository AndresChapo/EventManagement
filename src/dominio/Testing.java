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
		
		Evento entr3 = new Recital("Rock", ahora, duracion,
				"Guns n Roses", "Led Zeppelin", "Kiss", "Metal",
				1500, 800);
		System.out.println(entr3);
		return entr3;
	}
	
	public Entrada nuevaEntradaRecital(Evento eve) {
		Timestamp ahora = new Timestamp(System.currentTimeMillis());
		Time duracion = new Time(2, 30, 0);
		
		Entrada ticket = new Entrada(eve.getNumero(), eve, 123, "VIP");
		System.out.println(ticket);
		return ticket;
	}
}
