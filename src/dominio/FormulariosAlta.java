package dominio;

import java.sql.Time;
import java.sql.Timestamp;
import java.util.LinkedList;
import java.util.Scanner;

public class FormulariosAlta {
	private String opcion = "";
	Scanner in = new Scanner(System.in);
	private Testing test = new Testing();
	LinkedList<String> listaOpciones = new LinkedList<String>();
	
	public Evento altaEvento() {
		Evento eve;
		while(opcion !=  "0"){
			listarOpciones("Seleccione una opción","Recital","Teatro","Infantil","Deporte");
			 System.out.println("0. Salir");
//			 System.out.println("11. Recital TESTING");
			 System.out.println("Ingrese la opcion");
		     opcion = in.nextLine();

			 switch (opcion) {
				case "1":
					eve = altaEventoRecital();
					return eve;
				case "2":

					break;
				case "3":
					break;
				case "4":
					break;
				case "11":
					eve = test.nuevoRecital();
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

	public Evento altaEventoRecital() {
		String nombreEvento="";
		int anio=0;
		int mes=0;
		int dia=0;
		int hora=0;
		int minutos=0;
		int horasDuracion=0;
		int minutosDuracion=0;
		String bandaPricipal="";
		String bandaSoporte1="";
		String bandaSoporte2="";
		String genero="";
		
		String opcion ="";
		Scanner in = new Scanner(System.in);

		System.out.println("Nombre del evento: ");
		nombreEvento = in.nextLine();
		System.out.println("Fecha y hora del evento");
		System.out.println("Año: ");
		anio = Integer.parseInt(in.nextLine());
		System.out.println("Mes: ");
		mes = Integer.parseInt(in.nextLine());
		System.out.println("Día: ");
		dia = Integer.parseInt(in.nextLine());
		System.out.println("Hora: ");
		hora = Integer.parseInt(in.nextLine());
		System.out.println("Minutos: ");
		minutos = Integer.parseInt(in.nextLine());
		System.out.println("Duración del evento");
		System.out.println("Horas: ");
		horasDuracion = Integer.parseInt(in.nextLine());
		System.out.println("Minutos: ");
		minutosDuracion = Integer.parseInt(in.nextLine());
		
		System.out.println("Nombre de la banda pricipal: ");
		bandaPricipal = in.nextLine();
		System.out.println("Nombre de la banda Soporte1: ");
		bandaSoporte1 = in.nextLine();
		System.out.println("Nombre de la banda Soporte2: ");
		bandaSoporte2 = in.nextLine();
		listarOpciones("Elija el genero: ", "Rock", "Heavy Metal", "Reggaetón", "Trap", "Latino", "Pop");
		genero = in.nextLine();
		
		Timestamp diaHora=new Timestamp(anio-1900, mes-1, dia, hora, minutos, 0, 0);
		Time duracionEvento=new Time(horasDuracion, minutosDuracion, 0);
		Evento rec = new Recital(nombreEvento, diaHora, duracionEvento,
				bandaPricipal, bandaSoporte1, bandaSoporte2, genero);
		System.out.println("EVENTO DADO DE ALTA!");
		System.out.println(rec);
		System.out.println("PRESIONE CUALQUIER TECLA PARA CONTINUAR.");
		in.nextLine();
		return rec;
	}
	public int preguntarOpcion() {
		String opcion ="";
		Scanner in = new Scanner(System.in);
		opcion = in.nextLine();
		return Integer.parseInt(opcion);
	}
 
	public void mostrarOpciones(String encabezado, LinkedList<String> listaOpciones) {
		int count = 0;

		System.out.println(encabezado);
		System.out.println("-------------------");
		for(String opcion: listaOpciones) {
			count += 1;
			System.out.println(count + ". " +opcion);
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
	public void listarOpciones(String encabezado, String cadena1, String cadena2, String cadena3, String cadena4, String cadena5) {
		LinkedList<String> listaOpciones = new LinkedList<String>();
		listaOpciones.add(cadena1);
		listaOpciones.add(cadena2);
		listaOpciones.add(cadena3);
		listaOpciones.add(cadena4);
		listaOpciones.add(cadena5);
		mostrarOpciones(encabezado, listaOpciones);
		listaOpciones.removeAll(listaOpciones);
	}
	public void listarOpciones(String encabezado, String cadena1, String cadena2, String cadena3, String cadena4, String cadena5, String cadena6) {
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
	public FormulariosAlta() {
		super();
		// TODO Auto-generated constructor stub
	}
}
