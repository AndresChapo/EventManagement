package dominio;

import java.sql.Time;
import java.sql.Timestamp;

public class Testing {

	public Testing() {
		super();
		// TODO Auto-generated constructor stub
	}

	public void nuevoRecital() {
		Timestamp ahora = new Timestamp(System.currentTimeMillis());
		Time duracion = new Time(2, 30, 0);
		
		//Evento entr = new Evento("Rock", "Recital", ahora, 100.5 , duracion);
		//System.out.println(entr);

		Recital entr2Recital = new Recital();
		System.out.println(entr2Recital);
		
		Evento entr3 = new Recital("Rock", "Recital", ahora, duracion,
				"VIP", "Guns n Roses", "Led Zeppelin", "Kiss", "Metal",
				1500, 800);
		System.out.println(entr3);
	}
}
