package application;

import java.util.Scanner;

import entities.Hospede;

public class Program {

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		
		Hospede[] quartos = new Hospede[10];
		
		System.out.println("Quantos hóspedes chegaram?");
		int n = sc.nextInt();
	
		// pegar dados dos hospedes
		
		for(int i=1; i<=n; i++) {
			
			System.out.println("Hospede #" + i +":");
			System.out.print("Nome:");
			sc.nextLine();
			String nome = sc.nextLine();
			
			System.out.print("Email:");
			String email = sc.nextLine();
			
			System.out.print("Qual numero do quarto? ");
			
			int numeroQuarto = sc.nextInt();
			
			//Hospede h = new Hospede(nome, email);			
			//quartos[numeroQuarto] = h;
			
			quartos[numeroQuarto] =  new Hospede(nome, email);
		}
		
		System.out.println();
		System.out.println("Quartos ocupados: ");
		for (int i=0; i<10; i++) {
			if (quartos[i] != null) {
				System.out.println(i + ": " + quartos[i]);
			}
		}
		

	}

}
