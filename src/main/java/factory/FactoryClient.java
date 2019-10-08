package factory;

public class FactoryClient {

	enum Peliculas { Accion, Comedia, Drama, Terror}
	
	public static void main(String[] args) {
		FactoryPeliculas.make(Peliculas.Comedia).anadirCatalogo();
		FactoryPeliculas.make(Peliculas.Accion).anadirCatalogo();

	}

}
