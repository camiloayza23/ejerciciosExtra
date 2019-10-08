package builder;

public class Gigante extends ComboBuilder{
	
	public Gigante() {
		System.out.println("INFO > El cliente ha pedido un combo gigante");
	}

	@Override
	public void buildGaseosa() {
		System.out.println("Gaseosas: 2 grandes");
	}

	@Override
	public void buildPipoca() {
		System.out.println("Pipocas: Gigante");
		
	}

	@Override
	public void buildChocolates() {
		System.out.println("Chocolates: 2");
		
	}

	@Override
	public void buildPrecio() {
		System.out.println("Precio: 50");
		
	}


}
