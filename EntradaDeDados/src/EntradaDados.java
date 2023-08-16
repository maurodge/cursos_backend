import javax.swing.JOptionPane;

public class EntradaDados {

	public static void main(String[] args) {
		
		// entrada de dados via JOpitionPanel
		
		int idade;
		
		// integer.parseInt transforma o que será lido pelo JOptionPane em inteiro (pois na caixa de msg é esperado uma string)
		idade =Integer.parseInt(JOptionPane.showInputDialog("Informe a idade"));
		System.out.println("A pessoa tem: " + idade + " anos");
		
		// usando JOptionPane para exibir a resposta
		JOptionPane.showMessageDialog(null, "A pessoa tem " + idade + " anos de idade");

	}

}
