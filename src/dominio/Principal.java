package dominio;

import java.sql.Timestamp;
import java.util.Scanner;
import java.sql.Time;

public class Principal {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		Testing test = new Testing();
		
		String opcion = "";
		while(opcion !=  "0"){
			 System.out.println("---------------------------");	
			 System.out.println("1. Cargar Evento");
			 //System.out.println("2. Comprar Entradas");	
			 //System.out.println("3. Listar Entradas");	
			 System.out.println("---------TESTING----------");
			 System.out.println("11. Probar - Cargar Evento Deportivo");
			 System.out.println("12. Probar - Generar Entrara de Evento Deportivo");
			 //System.out.println("12. Probar - Cargar Evento Infantil");
			 //System.out.println("13. Probar - Cargar Evento Recital");
			//System.out.println("14. Probar - Cargar Evento Teatro");
			//System.out.println("---------------------------");
			 System.out.println("Ingrese la opcion");	
		     opcion = in.nextLine();
			 System.out.println();
			 switch (opcion) {
				case "1":
					break;
				case "11":
					test.nuevoRecital();
					break;
				case "12":
					test.nuevaEntradaRecital();
					break;
				default:
					System.out.println("Datos invalidos!");
					break;
			 }
		}
	}

}
