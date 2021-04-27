package dominio;

import java.sql.Timestamp;
import java.util.LinkedList;
import java.util.Scanner;
import java.sql.Time;

public class Principal {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		Testing test = new Testing();
		FormulariosAlta form = new FormulariosAlta();
		LinkedList<Evento> listaEventos = new LinkedList<Evento>();
		LinkedList<Entrada> listaEntradas = new LinkedList<Entrada>();
		

		
		String opcion = "";
		while(opcion !=  "0"){
			form.listarOpciones("Seleccione una opción","Cargar Evento","Listar Eventos","Generar Entradas","Listar Entradas");
			 System.out.println("---------TESTING----------");
			 System.out.println("11. Probar - Cargar Evento Recital");
			 System.out.println("12. Probar - Cargar Evento Teatro");
			 System.out.println("13. Probar - Cargar Evento Infantil");
			 System.out.println("14. Probar - Cargar Evento Deportivo");
			 System.out.println("20. Probar - Generar Entrada de Evento ID 1");
			 System.out.println("Ingrese la opcion");	
		     opcion = in.nextLine();
			 System.out.println();
			 switch (opcion) {
				case "1":
					listaEventos.add(form.altaEvento());
					break;
				case "2":
					for (Evento eve: listaEventos){
						System.out.println(eve);
					}
					System.out.println("PRESIONE CUALQUIER TECLA PARA CONTINUAR.");
					in.nextLine();
					break;
				case "3":
					System.out.println("---FALTA DESARROLLAR PANTALLA DE CARGA--- BASARSE EN altaEvento() Y CARGAR EL RESULTADO EN listaEntradas EL CUAL ES UN ARRAY DE Entradas");
					in.nextLine();
					break;
				case "4":
					for (Entrada ent: listaEntradas){
						System.out.println(ent);
					}
					System.out.println("PRESIONE CUALQUIER TECLA PARA CONTINUAR.");
					in.nextLine();
					break;
				case "11":
					listaEventos.add(test.nuevoRecital());
					break;
				case "12":
					listaEventos.add(test.nuevoTeatro());
					break;
				case "13":
					listaEventos.add(test.nuevoInfantil());
					break;
				case "14":
					listaEventos.add(test.nuevoDeportivo());
					break;
				case "20":
					listaEntradas.add(test.nuevaEntradaRecital(listaEventos.get(0)));
					break;
				default:
					System.out.println("Datos invalidos!");
					break;
			 }
		}
	}

}
