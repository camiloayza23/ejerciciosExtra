package builder;

public class Bife extends PlatoBuilder{
	
	public Bife() {
		System.out.println("INFO > El cliente ha pedido un bife");
	}

	@Override
	public void buildTipoCarne() {
		System.out.println("Tipo de carne: Bife");
		
	}

	@Override
	public void buildSaborRefresco() {
		System.out.println("Tipo de refresco: Coca cola");		
	}

	@Override
	public void buildGuarniciones() {
		System.out.println("Tipo de guarniciones: Papas fritas");
		
	}

}
