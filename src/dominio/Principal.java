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
		FormularioAltaEntrada formEntrada = new FormularioAltaEntrada();
		VentaEntrada formVenta = new VentaEntrada();
		AltaCliente formCliente = new AltaCliente();
		LinkedList<Evento> listaEventos = new LinkedList<Evento>();
		LinkedList<Entrada> listaEntradas = new LinkedList<Entrada>();
		LinkedList<Cliente> listaClientes = new LinkedList<Cliente>();
		LinkedList<Venta> listaVentas = new LinkedList<Venta>();
		
		String opcion = "";
		while(opcion !=  "0"){
			form.listarOpciones("Seleccione una opción","Cargar Evento","Listar Eventos","Generar Entradas","Listar Entradas","Comprar Entrada","Cargar Cliente","Listar Clientes","Listar Ventas");
			 System.out.println("---------TESTING----------");
			 System.out.println("11. Probar - Cargar Evento Recital");
			 System.out.println("12. Probar - Cargar Evento Teatro");
			 System.out.println("13. Probar - Cargar Evento Infantil");
			 System.out.println("14. Probar - Cargar Evento Deportivo");
			 System.out.println("15. Probar - Cargar Cliente");
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
					listaEntradas.add(formEntrada.altaEntrada(listaEventos));
					break;
				case "4":
					if(listaEntradas.size() != 0) {
					for (Entrada ent: listaEntradas){
						System.out.println(ent);
						System.out.println(listaEventos.get(ent.getIdEvento()-1).toStringBasicos());
					}
					} else {
						System.out.println("No hay entradas cargadas.");
					}
					System.out.println("PRESIONE CUALQUIER TECLA PARA CONTINUAR.");
					in.nextLine();
					break;
				case "5":
					Venta venta = new Venta();
					venta = formVenta.generarVenta(listaEventos,listaClientes,(listaVentas.size()+1),listaEntradas);
					if(venta != null) {
						listaVentas.add(venta);	
					}
					break;
				case "6":
					listaClientes.add(formCliente.CargarCliente(-1));
					break;
				case "7":
					if(listaClientes.size() != 0) {
					for (Cliente cli: listaClientes){
						System.out.println(cli);
					}
					} else {
						System.out.println("No hay clientes cargados.");
					}
					System.out.println("PRESIONE CUALQUIER TECLA PARA CONTINUAR.");
					in.nextLine();
					break;
				case "8":
					if(listaVentas.size() != 0) {
						for (Venta vent: listaVentas){
							System.out.println(vent);
						}
					} else {
						System.out.println("No hay ventas cargadas.");
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
				case "15":
					listaClientes.add(test.nuevoCLiente());
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
