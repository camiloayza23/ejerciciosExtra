package builder;


public class ClientBuilder {
	public static void main(String[] args) {
		Chef chef= new Chef();
		
		PlatoBuilder bife = new Bife();
		PlatoBuilder lomito = new Lomito();
		PlatoBuilder tira = new Tira();
		
		chef.setPlatoBuilder(bife);
		chef.buildPlato();
		
		chef.setPlatoBuilder(lomito);
		chef.buildPlato();
		
		chef.setPlatoBuilder(tira);
		chef.buildPlato();
		
	}
}
