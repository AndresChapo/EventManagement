package dominio;

import java.sql.Array;
import java.sql.Time;
import java.sql.Timestamp;
import java.util.stream.IntStream;
import java.util.*;


public class FormularioAltaEntrada {
	private String opcion = "";
	Scanner in = new Scanner(System.in);
	LinkedList<String> listaOpciones = new LinkedList<String>();
	Tipos tipos = new Tipos();
	String tipo = "";
	FormulariosAlta form = new FormulariosAlta();
	
	public Entrada altaEntrada(LinkedList<Evento> ListEvent) {
		Entrada entrada = new Entrada();
		boolean contain = false;
		Integer idEvento = -1;
		String opcion = "";		
		while(opcion !=  "0"){
			System.out.println("Seleccione el evento deseado: ");
			for (Evento eve: ListEvent){
				System.out.println(eve.getNumero() +". "+ eve.getNombreEvento());
			}
			opcion = in.nextLine(); //////////////// FALTA VALIDAR !!
			idEvento = Integer.parseInt(opcion) - 1;
			if (idEvento > -1 && idEvento < (ListEvent.size())) {
				entrada.setIdEvento(idEvento+1);
				tipo = ListEvent.get(idEvento).getTipoEvento();
				opcion ="0";
			}
			else {
				System.out.println("Datos invalidos!");	
			}
		}
		switch (tipo) {
			case "Recital":
				System.out.println("Usted eligio un Recital.");
				Recital r = (Recital) ListEvent.get(idEvento);
				opcion = "";
				while(opcion !=  "0"){
					form.listarOpciones("Seleccione la categoria: ","Entrada Vip: $1500","Entrada General: $800");
					opcion = in.nextLine();
					switch (opcion) {
						case "1":
							entrada.setPrecio(r.getPrecioEntradaVip());
							entrada.setCategoria("Vip");
							opcion = "0";
							break;
						case "2":
							entrada.setPrecio(r.getPrecioEntradaGeneral());
							entrada.setCategoria("General");
							opcion = "0";
							break;
						default:
							System.out.println("Datos invalidos!");
							break;
					}
				}
				break;
			case "Teatro":
				System.out.println("Usted eligio un evento de Teatro.");
				entrada.setPrecio(1350.5);
				entrada.setCategoria("General");			
				break;
			case "Infantil":
				System.out.println("Usted eligio un evento de Infantil.");
				Infantil i = (Infantil) ListEvent.get(idEvento);
				opcion = "";
				while(opcion !=  "0"){
					form.listarOpciones("Edad: ","Menor de 8 años: $250","Mayor de 8 años: $500");
					opcion = in.nextLine();
					switch (opcion) {
						case "1":
							entrada.setPrecio(i.getPrecioMenorDe8());
							entrada.setCategoria("Menor de 8 años");
							opcion = "0";
							break;
						case "2":
							entrada.setPrecio(i.getPrecioMayorDe8());
							entrada.setCategoria("Mayor de 8 años");
							opcion = "0";
							break;
						default:
							System.out.println("Datos invalidos!");
							break;
					}
				}
				break;
			case "Deportivo":
				System.out.println("Usted eligio un evento de Deportivo.");
				Deportivo d = (Deportivo) ListEvent.get(idEvento);

				if (d.isInternacional() == true) {
					entrada.setCategoria(d.getDeporte().getNombre() +" Internacional");
					entrada.setPrecio(d.getDeporte().getPrecio()*1.3);
				}else {
					entrada.setCategoria(d.getDeporte().getNombre() +" Nacional");
					entrada.setPrecio(d.getDeporte().getPrecio());
				}

				break;
		}
		System.out.println(entrada);
		System.out.println("ENTRADA CARGADA CON EXITO!");
		in.nextLine();
		return entrada;
	}
}
