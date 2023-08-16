package application;

import java.util.Scanner;

import entities.Product;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc =new Scanner (System.in);
		
		System.out.println("Digite a quantidade de produtos: ");
		int n = sc.nextInt();
		Product[] vect = new Product[n];
		
		// pedindo dados do vetor para o usuário
		for (int i=0; i<vect.length; i++) {
			System.out.println("Digite o nome do produto: ");
			String nome = sc.next();
			System.out.println("Digite o preço do produto: ");
			double preco = sc.nextDouble();
			
			// guardando os dados nas posições do vetor
			vect[i] = new Product(nome, preco);
			
		}
		
		// somando os n termos do vetor		
		double soma = 0;
		
		for (int i=0; i<vect.length; i++) {
			soma += vect[i].getPreco();
		
		}
		
		System.out.println("A soma dos valores é " + soma);
		sc.close();

	}

}
