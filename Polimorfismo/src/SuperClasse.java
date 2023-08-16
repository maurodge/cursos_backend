
public class SuperClasse {

	public static void main(String[] args) {
		
		// chamo a classe, crio objeto, instancio e chamo a classe expecifica
		// instanciando mamimero com superclasse
		Mamifero mam = new Cachorro();
		System.out.println(mam.cotaDiariaLeite() + " Litros");
		
		Mamifero mami = new Rato();
		System.out.println(mami.cotaDiariaLeite() + " Litros");
		
		

	}

}
