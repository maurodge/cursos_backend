package model.entities;

public class Vehicle {

	// variaveis da classe
	private String model;
	
	//objeto vazio para ser usado em outras classes
	public Vehicle() {
	}

	// construtor
	public Vehicle(String model) {
		
		this.model = model;
	}

	// getters and setters
	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}
	
}
