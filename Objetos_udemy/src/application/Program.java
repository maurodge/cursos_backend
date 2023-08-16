package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Product;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Informações do produto: ");
		
		System.out.print("Nome: ");
		String name = sc.nextLine();
		
		System.out.print("Preço: ");
		double price = sc.nextDouble();
		
		Product product = new Product(name, price);
		
		System.out.println();
		System.out.println("Dados do produto: " + product);
		
		System.out.println();
		System.out.println("Informe a quantidade de produtos que entraram no estoque: ");
		int quantity = sc.nextInt();
		product.addProducts(quantity);
		
		System.out.println();
		System.out.println("Dados atualizados: " + product);
		
		System.out.println();
		System.out.println("Informe a quantidade de produtos que entraram no estoque: ");
		quantity = sc.nextInt();
		product.removeProducts(quantity);
		
		System.out.println();
		System.out.println("Dados atualizados: " + product);
		
		
		
		
		sc.close();

	}

}
