import java.util.ArrayList;
import java.util.LinkedList;

import javax.swing.JOptionPane;

public class ArrayListCarros {

	public static void main(String[] args) {
/*
		// construindo um array list para carros
		ArrayList<String> carro = new ArrayList<>();
*/
		LinkedList<String> carro = new LinkedList<>();
		// adicionando itens ao ArrayList
		carro.add("Celta");
		carro.add("Gol");
		carro.add("Ka");
/*		
		// mostyrar o Array List
		System.out.println(carro);
		
		// substituir (local - id -, "novo valor")
		carro.set(0, "Fusca");
		
		// remover pela posição no vetor
		carro.remove(1);

		// mostrar nova lista
		System.out.println(carro);
		
		// adicionar com JOP
		carro.add(JOptionPane.showInputDialog("Informe o modelo do carro: "));
		
		// mostrar nova lista
		System.out.println(carro);
		
		// esvaziando o ArrayList
		//carro.clear() ;
		
		// substituição sem saber a posição
		if(carro.contains("Corsa")) {
			for (int i = 0; i < carro.size(); i++) {
				if ("Corsa".equals(carro.get(i))) {
					carro.set(i, "Brasilia");
					break;
				}
			}
		}
*/		
		
		// ARRAYLINK
		// incluindo item no incio
		carro.addFirst("Clio");
		
		// incluindo por ultimo
		carro.addLast("Pampa");
		
		// imprimindo a lista
		System.out.println(carro);
		
		//chamando um objeto pela posição
		String car;
		
		car = carro.get(3);
		System.out.println(car);
		
		
	}

}
