package application;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		File file = new File("C:\\Users\\User\\Documents\\0 MAURO\\PROGRAMAÇÃO\\in.txt");
		Scanner sc = null;

		// obrigatoriamente deve estar dentro de um try-catch
		try {
			sc = new Scanner(file);
			// testando se existem novas linhas no arquivo
			while (sc.hasNextLine()) {
				System.out.println(sc.nextLine());
			}
		}
		
		catch (IOException e) {
			System.out.println("Error: " + e.getMessage());
		}
		
		finally {
			if (sc != null) {
				sc.close();
			}
		}
	}

}
