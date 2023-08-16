
public class For {

	public static void main(String[] args) {
		// comando for
		
		// formato for ('varialvel definida e iniciada'; 'flag de saida' ; incremento)
		for(int i =1; i<=10; i++) {
			System.out.println("Estou fazendo isso pela " + i + "ª vez");
			
			
			// extraindo dados durante o for
			if(i==5) { 
				System.out.println("Parooou, achei aqui a " + i + "ª vez");
			// pode ser usado com ou sem break
				// break;
			}
		}

	}

}
