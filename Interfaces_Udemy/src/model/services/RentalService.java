package model.services;

import java.time.Duration;

import model.entities.CarRental;
import model.entities.Invoice;

public class RentalService {

	private Double pricePerDay;
	private Double pricePerHour;
	
	private TaxService taxService;
	
	
	// neste caso não tem construtor vazio para obrigar a entrada de dados quando iniciar o rentalservice
	public RentalService(Double pricePerDay, Double pricePerHour, TaxService taxService) {
		this.pricePerDay = pricePerDay;
		this.pricePerHour = pricePerHour;
		this.taxService = taxService;
	}
	
	// metodo de geração de fatura
	
	public void processInvoice(CarRental carRental) {
		
		// calculo da duração do servico para calcular o valor
		double minutes = Duration.between(carRental.getStart(), carRental.getFinish()).toMinutes();
		double hours = minutes/60.0;
		
		double basicPayment;
		if(hours <= 12.0) {
			// Math.ceil arredonda o valor da divisão para cima
			basicPayment = pricePerHour * Math.ceil(hours); 
		} else {
			basicPayment = pricePerDay * Math.ceil(hours/24.0);
		}
		
		double tax = taxService.tax(basicPayment);
		
		carRental.setInvoice(new Invoice());
	}
}