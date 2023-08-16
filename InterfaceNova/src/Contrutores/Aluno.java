package Contrutores;

public class Aluno {
	
	private double nota1;
	private double nota2;
	STATUS situacaoAluno;
	

	public Aluno(float nota1, float nota2) {
		this.nota1 = nota1;
		this.nota2 = nota2;
		
	}
	
	// criação de um enumerador "enum" (note que foi definido junto com as variaveis)
	public enum STATUS{
		APROVADO,
		REPROVADO
	}
	
	public double calcularMediaAluno() {
		double mediaAlunoFinal;
		mediaAlunoFinal = (this.nota1 + this.nota2)/2;
		return mediaAlunoFinal;
		
	}
	
	
}
