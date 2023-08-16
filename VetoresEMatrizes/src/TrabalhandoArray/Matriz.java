package TrabalhandoArray;

import javax.swing.JOptionPane;

public class Matriz {

	public static void main(String[] args) {
		
		// vetor de alunos
		String [] alunos = {"João", "Maria", "José"};
		
		// matriz de notas
		float [] [] notas = new float[3][4];
		
		float somaNotas, mediaAluno;
		
		String statusAluno;
		
		// laço para o usuario informar as notas
		for (int i = 0; i < 3; i++) {
			System.out.println("Aluno: " + alunos[i]);
			somaNotas = 0;
			mediaAluno = 0;
			
			for(int j=0; j<4; j++) {
				notas[i][j] = Float.parseFloat(JOptionPane.showInputDialog("Informe a " + (j+1) + "ª nota do aluno " + alunos[i]));
				
				
				somaNotas = somaNotas + notas[i][j];
			}
			/*
			mediaAluno = somaNotas / 4;
			System.out.println(alunos[i] + " teve media: " + mediaAluno);
		*/
		
		// imprimindo boletim completo concatenado
		System.out.println("***************Boletim*****************");
		System.out.println("Aluno: " + alunos[i]);
		System.out.println("Notas");
		for (int k1 = 0; k1 <4; k1++) {
			System.out.println((k1+1) + " - " + notas[i][k1]);
		}
		mediaAluno = somaNotas / 4;
		System.out.println(alunos[i] + " teve media: " + mediaAluno);
		}

	}

}
