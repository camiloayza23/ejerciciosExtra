package builder;

public class Mediana extends ComboBuilder{
	
	public Mediana() {
		System.out.println("INFO > El cliente ha pedido un combo mediano");
	}

	@Override
	public void buildGaseosa() {
		System.out.println("Gaseosas: 2 medianas");
	}

	@Override
	public void buildPipoca() {
		System.out.println("Pipocas: Mediana");
		
	}

	@Override
	public void buildChocolates() {
		System.out.println("Chocolates: 0");
		
	}

	@Override
	public void buildPrecio() {
		System.out.println("Precio: 30");
		
	}

}
