
public class While {

	public static void main(String[] args) {
		
		// comando while (testado)
		
		int i = 1;
				
		while (i<=10) {
			i++;
			System.out.println(i);
			
	
		}
		System.out.println("O laço foi executado " + (i-1) + " vezes");

	

	// comando do while (depois de testado)
		i=1;
	do {
		System.out.println("estou somando 1 " + i + " vezes");
		i++;
		
	}while (i<=10);
		System.out.println("Saida do laço depois de " + (i-1) + " vezes executado");
		
	
}
}
