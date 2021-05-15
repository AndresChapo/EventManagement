package dominio;

import java.util.LinkedList;

public class Tipos {
	private LinkedList<Genero> listaGenerosMusicales = new LinkedList<Genero>();
	private LinkedList<Genero> listaGenerosTeatrales = new LinkedList<Genero>();
	private LinkedList<Deporte> listaDeportes = new LinkedList<Deporte>();
	
	public Tipos() {
		super();

		listaGenerosTeatrales.add(new Genero(1, "Drama"));
		listaGenerosTeatrales.add(new Genero(2, "Teatro"));
		listaGenerosTeatrales.add(new Genero(3, "Comedia"));
		
		listaGenerosMusicales.add(new Genero(1, "Rock"));
		listaGenerosMusicales.add(new Genero(2, "Heavy Metal"));
		listaGenerosMusicales.add(new Genero(3, "Reggaetón"));
		listaGenerosMusicales.add(new Genero(4, "Trap"));
		listaGenerosMusicales.add(new Genero(5, "Latino"));
		listaGenerosMusicales.add(new Genero(6, "Pop"));
		
		listaDeportes.add(new Deporte(1, "Futbol",300));
		listaDeportes.add(new Deporte(2, "Rugby",450));		
		listaDeportes.add(new Deporte(3, "Hockey",280));
	}
	public void mostrarGenerosTeatrales() {
		for(Genero i:listaGenerosTeatrales) {
			System.out.println(i);
		}
	}

	public Genero getGeneroTeatral(int idGenero) {
		return listaGenerosTeatrales.get(idGenero-1); //devuelve el objeto completo
	}
	
	public void mostrarGenerosMusicales() {
		for(Genero i:listaGenerosMusicales) {
			System.out.println(i);
		}
	}

	public Genero getGeneroMusical(int idGenero) {
		return listaGenerosMusicales.get(idGenero-1); //devuelve el objeto completo
	}
	
	public void mostrarDeportes() {
		for(Deporte i:listaDeportes) {
			System.out.println(i);
		}
	}

	public Deporte getDeporte(int idDeporte) {
		return listaDeportes.get(idDeporte-1); //devuelve el objeto completo
	}

}
