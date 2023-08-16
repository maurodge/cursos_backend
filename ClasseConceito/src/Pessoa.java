
public class Pessoa {

	private String nome;
	private int idade;
	
	
	
	// escrevendo um metodo
	/*public void mostrarDados(String pNome, int pIdade) {
		System.out.println("nome:  " + pNome);
		System.out.println("idade: " + pIdade);
	}*/
	
	// metodo ToString (atalho crtl 3)
	
	@Override
	public String toString() {
		return "Pessoa [nome=" + nome + ", idade=" + idade + "]";
	}

	// encapsulamento gerando getter and setters (atalho ctrl 3)

	public String getNome() {
		return nome;
	}



	public void setNome(String nome) {
		this.nome = nome;
	}



	public int getIdade() {
		return idade;
	}



	public void setIdade(int idade) {
		this.idade = idade;
	}
	
	
	
	
}
