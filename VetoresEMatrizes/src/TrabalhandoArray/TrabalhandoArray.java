package TrabalhandoArray;

import javax.swing.JOptionPane;

public class TrabalhandoArray {

	public static void main(String[] args) {
		
		// declarando um Array de paises
		String [] paises = new String[4];
		// declarando array de numeros
		int[] numeros = new int[3];
		
		
		// pedindo para o usuário abastecer esse array
		for (int i = 0; i < 4; i++) {
			paises[i] = JOptionPane.showInputDialog("Informe um país: ");
			
		} 
		
		// listando o array de paises
		for (String listaPaises : paises) {
			System.out.println(listaPaises);
			
		}
		
		// abastecendo o array de numeros e transformando o resultado recebido em numero (integer.parseInt)
		for (int i = 0; i < 3; i++) {
			numeros[i] = Integer.parseInt(JOptionPane.showInputDialog("Informe um numero: "));
			
		}
		
		// listando os numeros
		for (Integer listaNumeros : numeros) {
			System.out.println(listaNumeros);
		}
		
		int novoValor = 11;
		numeros[2] = novoValor + numeros[1];
	}

}
