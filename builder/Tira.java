package builder;

public class Tira extends PlatoBuilder{
	
	public Tira() {
		System.out.println("INFO > El cliente ha pedido una tira");
	}

	@Override
	public void buildTipoCarne() {
		System.out.println("Tipo de carne: Tira");
		
	}

	@Override
	public void buildSaborRefresco() {
		System.out.println("Tipo de refresco: Coca cola");
		
	}

	@Override
	public void buildGuarniciones() {
		System.out.println("Tipo de guarnicion: Fideo");
		
	}

}
