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
	
	public Entrada altaEntrada(LinkedList<Evento> ListEvent , int idEntrada) {
		Entrada entrada = new Entrada();
		boolean contain = false;
		String eventId[] = new String[ListEvent.size() + 1];
		int cont = 0;
		String opcion = "";
		for (Evento eve: ListEvent){
			System.out.println(eve.getNumero() + eve.getNombreEvento());
			eventId[cont] = Integer.toString(eve.getNumero());
			cont ++; 
		}
		while(!contain) {
			System.out.println("Ingrese en numero de evento.");
			opcion = in.nextLine();
			 List<String> list = Arrays.asList(eventId);
			contain =  list.contains(opcion);
		}
		entrada.setIdEntrada(idEntrada);
		entrada.setIdEvento(Integer.parseInt(opcion));
		Teatro t = new Teatro();
		Recital r = new Recital();	
		
		return entrada;
	}
}
