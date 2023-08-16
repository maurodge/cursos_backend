package Programas;

public class Bovino implements InterfaceAnimal {
	
	@Override
	public void animalSom() {
		System.out.println("Muuu");
	}

	@Override
	public void animalComer() {
	    System.out.println("Grama");
	}

	@Override
	public void animalAbrigo() {
		System.out.println("Curral");
		
	}
}
