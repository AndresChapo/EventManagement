package dominio;

import java.sql.Time;
import java.sql.Timestamp;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.ArrayList;

public class VentaEntrada {
	private String opcion = "";
	Scanner in = new Scanner(System.in);

	public Venta generarVenta(LinkedList<Evento> ListEvent, LinkedList<Cliente> clientes, int idVenta,
			LinkedList<Entrada> listaEntradas) {
		int dni, idEvento = 0;
		opcion="";
		boolean clienteEncontrado = false;
		Venta v = new Venta();
		boolean noCargar = false;

		if (listaEntradas.size() > 0) {
			System.out.println("Ingrese su DNI: ");
			dni = Integer.parseInt(in.nextLine());
			for (Cliente cliente : clientes) {
				if (dni == cliente.getDni()) {
					clienteEncontrado = true;
				}
			}
			if (clienteEncontrado) {
				v.setDni(dni);
			} else {
				System.out.println("No se encontro ningun cliente cargado con ese DNI ");
				while (opcion != "0") {
					listarOpciones("¿Desea registrarse ?", "SI", "NO");
					opcion = in.nextLine();
					switch (opcion) {
					case "1":
						AltaCliente altaCliente = new AltaCliente();
						clientes.add(altaCliente.CargarCliente(dni));
						opcion = "0";
						break;
					case "2":
						noCargar = true;
						opcion = "0";
						break;
					default:
						System.out.println("Datos invalidos!");
						break;
					}
				}
				opcion="";
			}
			if (!noCargar) {
				while (opcion != "0") {
					System.out.println("Seleccione el evento deseado: ");
					for (Evento eve : ListEvent) {
						for (int i = 0; i < listaEntradas.size(); i++) {
							if (listaEntradas.get(i).getIdEvento() == eve.getNumero()) {
								System.out.println(eve.getNumero() + ". " + eve.getNombreEvento());
							}
						}
					}
					opcion = in.nextLine(); //////////////// FALTA VALIDAR !!
					idEvento = Integer.parseInt(opcion);
					if (idEvento > 0 && idEvento < (ListEvent.size()+1)) {
						v.setIdEvento(idEvento);
						opcion = "0";
					} else {
						System.out.println("Datos invalidos!");
					}
				}
				v.setIdVenta(idVenta);
				System.out.println("Cantidad de entradas a comprar: ");
				v.setCantEntrada(Integer.parseInt(in.nextLine())); 
				
				for (Entrada ent : listaEntradas) {
					if (ent.getIdEvento() == v.getIdVenta()) {
						v.setIdEntrada(ent.getIdEntrada());
						v.setPrecio(ent.getPrecio());
					}
				}
				System.out.println("Entrada comprada con exito ");
				System.out.println("PRESIONE CUALQUIER TECLA PARA CONTINUAR.");
				in.nextLine();
				return v;
			} else {
				System.out.println("Regresando al menu principal ");
				System.out.println("PRESIONE CUALQUIER TECLA PARA CONTINUAR.");
				in.nextLine();
				return null;
			}

		} else {
			System.out.println("No hay entradas disponibles ");
			System.out.println("PRESIONE CUALQUIER TECLA PARA CONTINUAR.");
			in.nextLine();
			return null;
		}
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

}
