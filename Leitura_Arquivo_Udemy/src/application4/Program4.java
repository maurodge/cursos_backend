package application4;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Program4 {

	public static void main(String[] args) {
		// escrevendo no arquivo de texto selecionado
		
		String[] lines = new String[] { "Testando a inserção de texto ou arquivo de texto", "isto na linha de baixo"};
		
		String path = "C:\\Users\\User\\Documents\\0 MAURO\\PROGRAMAÇÃO\\out.txt";
		
		// caso o arquivo ja exista ele sera recriado, a manos que o new filewriter esteja direciando para 
		// um (path, true), como na linha de baixo, neste caso, ele acrescenta ao texto as linhas informadas no vetor lines
		//try (BufferedWriter bw = new BufferedWriter(new FileWriter(path, true))) {
		try (BufferedWriter bw = new BufferedWriter(new FileWriter(path))) {
			for (String line : lines) {
				bw.write(line);
				bw.newLine();
			}
		}
		catch (IOException e) {
			e.printStackTrace();
		}

	}

}
