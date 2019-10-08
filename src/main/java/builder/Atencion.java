package builder;

public class Atencion {
	
private ComboBuilder comboBuilder;
	
	public void setComboBuilder (ComboBuilder builder) { comboBuilder=builder;}
	public Combo getCombo() { return comboBuilder.getCombo();}
	
	public void buildCombo() {
		comboBuilder.createCombo();
		comboBuilder.buildChocolates();
		comboBuilder.buildGaseosa();
		comboBuilder.buildPipoca();
		comboBuilder.buildPrecio();
	}

}
