package builder;

public class Lomito extends PlatoBuilder{
	
	public Lomito() {
		System.out.println("INFO > El cliente ha pedido un lomito");
	}

	@Override
	public void buildTipoCarne() {
		System.out.println("Tipo de carne: Lomo");
		
	}

	@Override
	public void buildSaborRefresco() {
		System.out.println("Tipo de refresco: Pepsi");
		
	}

	@Override
	public void buildGuarniciones() {
		System.out.println("Tipo de guarnicion: Arroz");
		
	}

}
