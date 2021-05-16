package dominio;

import java.sql.Time;
import java.sql.Timestamp;
import java.util.ArrayList;

public class Testing {
	public Tipos tipos = new Tipos();
	
	public Testing() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Evento nuevoRecital() {
		Timestamp ahora = new Timestamp(System.currentTimeMillis());
		Time duracion = new Time(2, 30, 0);
		
		Evento eve = new Recital("Rock en las rocas", ahora, duracion,
				"Guns n Roses", "Led Zeppelin", "Kiss", this.tipos.getGeneroMusical(1));
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
				this.tipos.getGeneroTeatral(1), actores);
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
//		Deporte futbol = new Deporte(1,"Futbol",300);

		Evento eve = new Deportivo("Supercampeones", ahora, duracion,this.tipos.getDeporte(1),true);
		System.out.println(eve);
		return eve;
	}
	
	public Entrada nuevaEntradaRecital(Evento eve) {
		Timestamp ahora = new Timestamp(System.currentTimeMillis());
		Time duracion = new Time(2, 30, 0);
		
		Entrada ticket = new Entrada(eve.getNumero(), 123, "VIP");
		System.out.println(ticket);
		return ticket;
	}
	
	public Cliente nuevoCLiente() {
		Cliente c = new Cliente();
		c.setDni(1);
		c.setNombre("nombre");
		c.setApellido("apellido");
		c.setDireccion("direccion");
		c.setGenero("genero");
		c.setLocalidad("localidad");
		c.setProvincia("provincia");
		return c;
	}

}
