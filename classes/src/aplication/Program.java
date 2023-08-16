package aplication;

import java.util.Scanner;
import entities.Triangle;

public class Program {

	public static void main(String[] args) {

// calculando area do triangulo com metodos e classes para inserção de dados
		Scanner sc = new Scanner (System.in);
		
		Triangle x, y;
		x = new Triangle();
		y = new Triangle();
		
		System.out.println("Digite as medidas do triangulo x. Lado A: ");
		x.a = sc.nextDouble();
		System.out.println("Lado B: ");
		x.b = sc.nextDouble();
		System.out.println("Lado C: ");
		x.c = sc.nextDouble();
		
		System.out.println("Digite as medidas do triangulo y. Lado A: ");
		y.a = sc.nextDouble();
		System.out.println("Lado B: ");
		y.b = sc.nextDouble();
		System.out.println("Lado C: ");
		y.c = sc.nextDouble();
		
		double areaX = x.area();
		double areaY = y.area();
		
		System.out.println("Triangulo X tem area: " + areaX);
		System.out.println("Triangulo Y tem area: " + areaY);
		
		if (areaX > areaY) {
			System.out.println("O maior tringulo é o X com área: " + areaX);
		} else {
			System.out.println("O maior tringulo é o Y com área: " + areaY);
		}
		
		sc.close();

	}

}
