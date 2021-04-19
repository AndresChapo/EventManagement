package dominio;

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
			listaOpciones.add("Recital");
			listaOpciones.add("Teatro");
			listaOpciones.add("Infantil");
			listaOpciones.add("Deporte");
			mostrarOpciones("Seleccione una opción",listaOpciones);
			listaOpciones.removeAll(listaOpciones);
			
			 System.out.println("0. Salir");
			 System.out.println("11. Recital TESTING");
			 System.out.println("Ingrese la opcion");
		     opcion = in.nextLine();
//			 System.out.println();
			 switch (opcion) {
				case "1":
					listaOpciones.add("Recital");
					listaOpciones.add("Teatro");
					listaOpciones.add("Infantil");
					listaOpciones.add("Deporte");
					mostrarOpciones("Seleccione una opción",listaOpciones);
					listaOpciones.removeAll(listaOpciones);
					System.out.println("PRESIONE CUALQUIER TECLA PARA CONTINUAR.");
					in.nextLine();
					break;
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
		Evento rec = new Recital();

//		Entrada [idEntrada=2, idEvento=2, evento=Entrada [numero=2, tipoEvento=Recital, nombreEvento=Rock, diaHora=2021-04-18 23:20:36.506, duracionEvento=02:30:00] Detalles del Recital [bandaPricipal=Guns n Roses, bandaSoporte1=Led Zeppelin, bandaSoporte2=Kiss, genero=Metal, precioEntradaVip=1500.0, precioEntradaGeneral=800.0], precio=123.0, categoria=VIP]
		return rec;
	}
	
	public 
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
	
	public FormulariosAlta() {
		super();
		// TODO Auto-generated constructor stub
	}
}
