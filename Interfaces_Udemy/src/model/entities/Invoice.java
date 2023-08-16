package model.entities;

public class Invoice {

	// variaveis da classe
	private Double basicPayment;
	private Double tax;
	
	// objeto vazio para ser usado em outras classes
	public Invoice() {		
	}

	// construtor
	public Invoice(Double basicPayment, Double tax) {
		
		this.basicPayment = basicPayment;
		this.tax = tax;
	}

	// getters and setters
	public Double getBasicPayment() {
		return basicPayment;
	}

	public void setBasicPayment(Double basicPayment) {
		this.basicPayment = basicPayment;
	}

	public Double getTax() {
		return tax;
	}

	public void setTax(Double tax) {
		this.tax = tax;
	}
	
	// o pagamento é um valor calculado seguindo o metodo abaixo
	public Double getTotalPayment() {
		return getBasicPayment() + getTax();
	}
}
