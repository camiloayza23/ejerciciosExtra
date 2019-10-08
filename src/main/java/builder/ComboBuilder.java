package builder;


public abstract class ComboBuilder {
	
	
	protected Combo combo;
	
	public Combo getCombo()  { return combo;}
	
	public void createCombo() { combo = new Combo(); }
	
	public abstract void buildGaseosa();
	public abstract void buildPipoca();
	public abstract void buildChocolates();
	public abstract void buildPrecio();
	
}
