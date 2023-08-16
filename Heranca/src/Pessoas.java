
public class Pessoas {

	public static void main(String[] args) {
		
		// Instanciamento
		PFisica fis = new PFisica();
		PJuridica jus = new PJuridica();
		
		
		// dando valores aos atributos / isso pode estar no banco de dados
		jus.nome = "João";
		jus.cnpj = "11.111.111/0001-11";
		jus.situacaoPessoa = true;
		
		fis.nome = "Maria";
		fis.cpf = "111.111.111-11";
		fis.situacaoPessoa = false;
		
		
		
		System.out.println("Dados da Pessoa Fisica: " + fis.toString());
		
		System.out.println("Dados da Pessoa Juridica: " +  jus.toString());
       
	

		}}
