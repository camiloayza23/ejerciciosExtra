package builder;


public class ClientBuilder {
	public static void main(String[] args) {
		Atencion atencion= new Atencion();
		
		ComboBuilder gigante = new Gigante();
		ComboBuilder mediano = new Mediana();
		ComboBuilder pequeno = new Pequena();
		
		atencion.setComboBuilder(gigante);
		atencion.buildCombo();
		
		atencion.setComboBuilder(mediano);
		atencion.buildCombo();
		
		atencion.setComboBuilder(pequeno);
		atencion.buildCombo();
		
	}
}
