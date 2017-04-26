package com.niit.di;

public class Travaller {
	private String name;
	private int kmTravelled;
	private double travelCost;
	private Vehicle vehicle;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getKmTravelled() {
		return kmTravelled;
	}
	public void setKmTravelled(int kmTravelled) {
		this.kmTravelled = kmTravelled;
	}

	public double getTravelCost() {
		return this.getKmTravelled() * this.getVehicle().getCostPerKm();
	}
	public void setTravelCost(double travelCost) {
		this.travelCost = travelCost;
	}
	public Vehicle getVehicle() {
		return vehicle;
	}
	public void setVehicle(Vehicle vehicle) {
		this.vehicle = vehicle;
	}

}
