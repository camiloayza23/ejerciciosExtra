package builder;

public class Pequena extends ComboBuilder{
	
	public Pequena() {
		System.out.println("INFO > El cliente ha pedido un compo pequeno");
	}

	@Override
	public void buildGaseosa() {
		System.out.println("Gaseosas: 1 pequena");
	}

	@Override
	public void buildPipoca() {
		System.out.println("Pipocas: Economicas");
		
	}

	@Override
	public void buildChocolates() {
		System.out.println("Chocolates: 0");
		
	}

	@Override
	public void buildPrecio() {
		System.out.println("Precio: 15");
		
	}

}
