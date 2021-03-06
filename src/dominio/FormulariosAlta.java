package dominio;

import java.sql.Time;
import java.sql.Timestamp;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.ArrayList;

public class FormulariosAlta {
	private String opcion = "";
	Scanner in = new Scanner(System.in);
	private Testing test = new Testing();
	LinkedList<String> listaOpciones = new LinkedList<String>();
	Tipos tipos = new Tipos();

	public Evento altaEvento() {
		String nombreEvento = "";
		int anio = 0;
		int mes = 0;
		int dia = 0;
		int hora = 0;
		int minutos = 0;
		int horasDuracion = 0;
		int minutosDuracion = 0;
		System.out.println("Nombre del evento: ");
		nombreEvento = in.nextLine();
		System.out.println("Fecha y hora del evento");
		System.out.println("A?o: ");
		anio = Integer.parseInt(in.nextLine());
		System.out.println("Mes: ");
		mes = Integer.parseInt(in.nextLine());
		System.out.println("D?a: ");
		dia = Integer.parseInt(in.nextLine());
		System.out.println("Hora: ");
		hora = Integer.parseInt(in.nextLine());
		System.out.println("Minutos: ");
		minutos = Integer.parseInt(in.nextLine());
		System.out.println("Duraci?n del evento");
		System.out.println("Horas: ");
		horasDuracion = Integer.parseInt(in.nextLine());
		System.out.println("Minutos: ");
		minutosDuracion = Integer.parseInt(in.nextLine());

		Timestamp diaHora = new Timestamp(anio - 1900, mes - 1, dia, hora, minutos, 0, 0);
		Time duracionEvento = new Time(horasDuracion, minutosDuracion, 0);
		Evento eve = null;
		opcion = "";
		while (opcion != "0") {
			listarOpciones("Seleccione una opci?n", "Recital", "Teatro", "Infantil", "Deporte");
			System.out.println("0. Salir");
			System.out.println("Ingrese la opcion");
			opcion = in.nextLine();

			switch (opcion) {
				case "1":
					eve = altaTipoEvento("recital", nombreEvento, diaHora, duracionEvento, eve);
					return eve;
				case "2":
					eve = altaTipoEvento("teatro", nombreEvento, diaHora, duracionEvento, eve);
					return eve;
				case "3":
					eve = altaTipoEvento("infantil", nombreEvento, diaHora, duracionEvento, eve);
					return eve;
				case "4":
					eve = altaTipoEvento("deporte", nombreEvento, diaHora, duracionEvento, eve);
					return eve;
				case "0":
					return null;
	
				default:
					System.out.println("Dato invalido!");
					break;
			}
		}
		return null;
	}

	public Evento altaTipoEvento(String tipoEvento, String nombreEvento, Timestamp diaHora, Time duracionEvento,
			Evento evento) {
		switch (tipoEvento) {
		case "recital":
			Recital rec = new Recital(nombreEvento, diaHora, duracionEvento);
			System.out.println("Nombre de la banda pricipal: ");
			rec.setBandaPricipal(in.nextLine());
			System.out.println("Nombre de la banda Soporte1: ");
			rec.setBandaSoporte1(in.nextLine());
			System.out.println("Nombre de la banda Soporte2: ");
			rec.setBandaSoporte2(in.nextLine());
			opcion ="";
			while(opcion!="0") {
				listarOpciones("Elija el genero: ", "Rock", "Heavy Metal", "Reggaet?n", "Trap", "Latino", "Pop");
				opcion = in.nextLine();
				switch(opcion) {
				case "1":
				case "2":
				case "3":
				case "4":
				case "5":
				case "6":
					rec.setGenero(tipos.getGeneroMusical(Integer.parseInt(opcion)));
					opcion = "0";
					break;
				default:
					System.out.println("Datos invalidos!");
					break;
				}
			}
			System.out.println("EVENTO DADO DE ALTA!");
			System.out.println(rec);
			evento = rec;
			break;
		case "teatro":
			int cantActores;
			ArrayList actores = new ArrayList();
			Teatro teatro = new Teatro(nombreEvento, diaHora, duracionEvento);
			System.out.println("Ingrese la cantidad de actores: ");
			cantActores = Integer.parseInt(in.nextLine());
			System.out.println(cantActores);
			for (int i = 0; i < cantActores; i++) {
				System.out.println("Ingrese el actor: ");
				actores.add(in.nextLine());
			}
			teatro.setActores(actores);
			listarOpciones("Elija el genero: ", "Drama", "Teatro", "Comedia");
			teatro.setGenero(tipos.getGeneroTeatral(Integer.parseInt(in.nextLine())));
			System.out.println("EVENTO DADO DE ALTA!");
			System.out.println(teatro);
			evento = teatro;
			break;
		case "deporte":
			Deportivo deportivo = new Deportivo(nombreEvento, diaHora, duracionEvento);
			Deporte deporte = new Deporte();
			while (opcion != "0") {
				listarOpciones("Ingrese el tipo de evento depertivo: ", "Futbol", "Rugby", "Hockey");
				System.out.println("0. Salir");
				System.out.println("Ingrese la opcion");
				opcion = in.nextLine();
				switch (opcion) {
					case "1":
					case "2":
					case "3":
						deportivo.setDeporte(tipos.getDeporte(Integer.parseInt(opcion)));
						opcion = "0";
						break;
					default:
						System.out.println("Datos invalidos!");
						break;
				}
			}

			opcion ="";
			while(opcion !=  "0"){
				listarOpciones("?El Evento es Internacional?:","SI","NO");
				opcion = in.nextLine();
				switch (opcion) {
					case "1":
						deportivo.setInternacional(true);
						opcion ="0";
						break;
					case "2":
						deportivo.setInternacional(false);
						opcion ="0";
						break;
					default:
						System.out.println("Datos invalidos!");
						break;
				}
			}
			
			System.out.println("EVENTO DADO DE ALTA!");
			System.out.println(deportivo);
			evento = deportivo;
			break;
		case "infantil":
			String opcion ="";
			boolean souvenir=false;
			while(opcion !=  "0"){
				listarOpciones("?Se entrega souvenir en el evento?:","SI","NO");
				opcion = in.nextLine();
				switch (opcion) {
					case "1":
						souvenir = true;
						opcion ="0";
						break;
					case "2":
						souvenir = false;
						opcion ="0";
						break;
					default:
						System.out.println("Datos invalidos!");
						break;
				}
			}
			
			Infantil infantil = new Infantil(nombreEvento, diaHora, duracionEvento,souvenir);
			System.out.println("EVENTO DADO DE ALTA!");
			System.out.println(infantil);
			evento = infantil;
			break;
		}
		System.out.println("PRESIONE CUALQUIER TECLA PARA CONTINUAR.");
		in.nextLine();
		return evento;
	}

	public int preguntarOpcion() {
		String opcion = "";
		Scanner in = new Scanner(System.in);
		opcion = in.nextLine();
		return Integer.parseInt(opcion);
	}

	public void mostrarOpciones(String encabezado, LinkedList<String> listaOpciones) {
		int count = 0;

		System.out.println(encabezado);
		System.out.println("-------------------");
		for (String opcion : listaOpciones) {
			count += 1;
			System.out.println(count + ". " + opcion);
		}
		System.out.println("-------------------");
	}

	public void listarOpciones(String encabezado, String cadena1, String cadena2) {
		LinkedList<String> listaOpciones = new LinkedList<String>();
		listaOpciones.add(cadena1);
		listaOpciones.add(cadena2);
		mostrarOpciones(encabezado, listaOpciones);
		listaOpciones.removeAll(listaOpciones);
	}

	public void listarOpciones(String encabezado, String cadena1, String cadena2, String cadena3) {
		LinkedList<String> listaOpciones = new LinkedList<String>();
		listaOpciones.add(cadena1);
		listaOpciones.add(cadena2);
		listaOpciones.add(cadena3);
		mostrarOpciones(encabezado, listaOpciones);
		listaOpciones.removeAll(listaOpciones);
	}

	public void listarOpciones(String encabezado, String cadena1, String cadena2, String cadena3, String cadena4) {
		LinkedList<String> listaOpciones = new LinkedList<String>();
		listaOpciones.add(cadena1);
		listaOpciones.add(cadena2);
		listaOpciones.add(cadena3);
		listaOpciones.add(cadena4);
		mostrarOpciones(encabezado, listaOpciones);
		listaOpciones.removeAll(listaOpciones);
	}

	public void listarOpciones(String encabezado, String cadena1, String cadena2, String cadena3, String cadena4,
			String cadena5) {
		LinkedList<String> listaOpciones = new LinkedList<String>();
		listaOpciones.add(cadena1);
		listaOpciones.add(cadena2);
		listaOpciones.add(cadena3);
		listaOpciones.add(cadena4);
		listaOpciones.add(cadena5);
		mostrarOpciones(encabezado, listaOpciones);
		listaOpciones.removeAll(listaOpciones);
	}

	public void listarOpciones(String encabezado, String cadena1, String cadena2, String cadena3, String cadena4,
			String cadena5, String cadena6) {
		LinkedList<String> listaOpciones = new LinkedList<String>();
		listaOpciones.add(cadena1);
		listaOpciones.add(cadena2);
		listaOpciones.add(cadena3);
		listaOpciones.add(cadena4);
		listaOpciones.add(cadena5);
		listaOpciones.add(cadena6);
		mostrarOpciones(encabezado, listaOpciones);
		listaOpciones.removeAll(listaOpciones);
	}
	
	public void listarOpciones(String encabezado, String cadena1, String cadena2, String cadena3, String cadena4,
			String cadena5, String cadena6, String cadena7, String cadena8) {
		LinkedList<String> listaOpciones = new LinkedList<String>();
		listaOpciones.add(cadena1);
		listaOpciones.add(cadena2);
		listaOpciones.add(cadena3);
		listaOpciones.add(cadena4);
		listaOpciones.add(cadena5);
		listaOpciones.add(cadena6);
		listaOpciones.add(cadena7);
		listaOpciones.add(cadena8);
		mostrarOpciones(encabezado, listaOpciones);
		listaOpciones.removeAll(listaOpciones);
	}

	public FormulariosAlta() {
		super();
		// TODO Auto-generated constructor stub
	}
}
