package builder;

public class Chef {
	
private PlatoBuilder platoBuilder;
	
	public void setPlatoBuilder (PlatoBuilder builder) { platoBuilder=builder;}
	public Plato getPlato() { return platoBuilder.getPlato();}
	
	public void buildPlato() {
		platoBuilder.createPlato();
		platoBuilder.buildGuarniciones();
		platoBuilder.buildSaborRefresco();
		platoBuilder.buildTipoCarne();
	}

}
