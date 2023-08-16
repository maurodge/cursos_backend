package Contrutores;

import Contrutores.Aluno.STATUS;


public class Construtor {

	public static void main(String[] args) {
		
		// passando os dados atraves do construtor
		Aluno al = new Aluno(6, 5);
		
		double mediaAlunoFinal = al.calcularMediaAluno();
		
       // defionindo a situação do aluno
		if(mediaAlunoFinal < 7) {
			al.situacaoAluno = STATUS.REPROVADO;
			
		}else {
			al.situacaoAluno = STATUS.APROVADO;
			
		}
		
		System.out.println("O aluno está " + al.situacaoAluno + " com média final: "+ mediaAlunoFinal);

	}

}
