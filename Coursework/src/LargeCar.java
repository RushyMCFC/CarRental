
public class LargeCar implements Car{
	private RegistrationNumber regNo;
	private double fuel;
	private boolean rented;
	
	public LargeCar(RegistrationNumber regNo, double fuel) {
		this.regNo = regNo;
		this.fuel = fuel;
		this.rented = false;
		totalFuel();
	}
	
	private void totalFuel() {
		if(fuel > 60.0) {
			fuel = 60.0;
		}
	}
	
	public double getFuel() {
		return fuel;
	}
	
	public String getRegNo() {
		return regNo.getRegNumber();
	}
	
	public String getType() {
		return "Large Car";
	}
	
	public boolean getRented() {
		return rented;
	}
	
	public boolean checkTank() {
		if(fuel == 60.0) {
			return true;
		}
		else
			return false;
	}
	
	public double addFuel(double addF) {
		if(fuel == 60.0) {
			return 0;
		}
		else {
			if(addF+fuel >= 60.0) {
				double temp = fuel;
				fuel = 60.0;
				return 60.0-temp;
			}
			else {
				fuel = fuel+addF;
				return addF;
			}
		}
	}
	
	public int drive(int km) {
		boolean checkRented = getRented();
		double totalDistance = 0.0;
		if(fuel <= 5.0) {
			totalDistance = 10*fuel;
		}
		else {
			totalDistance = (10*5.0) + (15*(fuel-5.0));
		}
		if(checkRented == false) {
			return -2;
		}
		else {
			if(km > totalDistance) {
				return -1;
			}
			else {
				double consumedFuel = 0.0;
				if(km <= 50) {
					consumedFuel = km/10;
				}
				else {
					consumedFuel = 5 + ((km-50.0)/15);
				}
				fuel = fuel - consumedFuel;
				return (int) consumedFuel;
			}
		}
	}
	
	public String toString() {
		String display = "Car Type : "+getType();
		display += "\nRegistration Number : "+getRegNo();
		display += "\nTotal Fuel : "+getFuel();
		display += "\nRented : "+getRented();
		return display;
	}
}
