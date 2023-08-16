package model.entities;

import java.time.LocalDateTime;

public class CarRental {

	// parametros da classe
	private LocalDateTime start;
	private LocalDateTime finish;
	
	// associações com outras classes
	private Vehicle vehicle;
	private Invoice invoice;
	
	
	// objeto vazio para ser usado em outras classes
	public CarRental() {
		
	}

	// metodo construtor automatico sem o super
	public CarRental(LocalDateTime start, LocalDateTime finish, Vehicle vehicle) {
		
		this.start = start;
		this.finish = finish;
		this.vehicle = vehicle;
		
	}

	// getters e setters
	public LocalDateTime getStart() {
		return start;
	}

	public void setStart(LocalDateTime start) {
		this.start = start;
	}

	public LocalDateTime getFinish() {
		return finish;
	}

	public void setFinish(LocalDateTime finish) {
		this.finish = finish;
	}

	public Vehicle getVehicle() {
		return vehicle;
	}

	public void setVehicle(Vehicle vehicle) {
		this.vehicle = vehicle;
	}

	public Invoice getInvoice() {
		return invoice;
	}

	public void setInvoice(Invoice invoice) {
		this.invoice = invoice;
	}
	
	

	
}
