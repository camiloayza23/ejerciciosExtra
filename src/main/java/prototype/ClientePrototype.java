package prototype;

public class ClientePrototype {
	public static void main(String[] args) {

		Boleto boleto1 = new Boleto();
		boleto1.setCategoria("Infantil");
		boleto1.setCine("MegaCenter");
		boleto1.setNombrePelicula("Libro de la selva");
		boleto1.setHora("9:00");
		boleto1.setFuncion("Matine");
		boleto1.setNumeroDeAsiento("1");
		boleto1.setRecomendaciones("No dejar basura en el asiento");

		Boleto boleto2 = (Boleto) boleto1.clone();
		Boleto boleto3 = (Boleto) boleto1.clone();
		
		boleto2.setNumeroDeAsiento("2");
		boleto3.setNumeroDeAsiento("3");
		
		System.out.println("Asientos Boleto 1: " + boleto1.getNumeroDeAsiento());
		System.out.println("Asientos Boleto 2: " + boleto2.getNumeroDeAsiento());
		System.out.println("Asientos Boleto 3: " + boleto3.getNumeroDeAsiento());
		
	}
}
