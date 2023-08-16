package Programas;

public class InterfacePrincipal {

	public static void main(String[] args) {
	
	System.out.println("esse é o boi:");	
		Bovino bo = new Bovino();
		bo.animalAbrigo();
		bo.animalComer();
		bo.animalSom();
		
	System.out.println("esse é o gado:");
		Gado ga = new Gado();
		ga.animalAbrigo();
		ga.animalComer();
		ga.animalSom();
	}

}
