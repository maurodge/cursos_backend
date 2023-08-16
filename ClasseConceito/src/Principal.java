
public class Principal {

	public static void main(String[] args) {
		
		// instanciamento declaro a classe, nomeio o objeto, construtor "new", e atribuo a classe desejada
		// chamando a classe pessoa / nomeando de pes / recebendo atributos da classe pessoa 
		Pessoa pes = new Pessoa();
		
		/*
		// dando valores aos atributods da classe pessoa (isso pode estar em um banco de dados
		pes.nome = "João da Silva";
		pes.idade = 15;
		
		// chamando o metoda da classe
		pes.mostrarDados(pes.nome, pes.idade);
        */
		
		// apos criado o getter e setter e deixar os atributos privados, posso chama-los dentro da classe principal
		
		pes.setNome("João");
		pes.setIdade(0);
		System.out.println(pes.toString());
		
	}

}
