package factory;

import factory.FactoryClient.Peliculas;

public class FactoryPeliculas {
	

		public static Pelicula make(Peliculas type) {
			Pelicula pelicula = null;

			switch (type) {
			case Accion:
				pelicula = new Accion();
				break;
			case Comedia:
				pelicula = new Comedia();
				break;
			case Drama:
				pelicula = new Drama();
				break;
			case Terror:
				pelicula = new Terror();
				break;
			default:
				break;
			}
			return pelicula;
		}

}
