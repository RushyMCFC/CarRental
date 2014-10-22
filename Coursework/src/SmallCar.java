
public class SmallCar implements Car{
	private RegistrationNumber regNo;
	private double fuel;
	private boolean rented;
	
	public SmallCar(RegistrationNumber regNo, double fuel) {
		this.regNo = regNo;
		this.fuel = fuel;
		this.rented = false;
		totalFuel();
	}
	
	private void totalFuel() {
		if(fuel > 49.0) {
			fuel = 49.0;
		}
	}
	
	public double getFuel() {
		return fuel;
	}
	
	public String getRegNo() {
		return regNo.getRegNumber();
	}
	
	public String getType() {
		return "Small Car";
	}
	
	public boolean getRented() {
		return rented;
	}
	
	public boolean checkTank() {
		if(fuel == 49.0) {
			return true;
		}
		else
			return false;
	}
	
	public double addFuel(double addF) {
		if(fuel == 49.0) {
			return 0;
		}
		else {
			if(addF+fuel >= 49.0) {
				double temp = fuel;
				fuel = 49.0;
				return 49.0-temp;
			}
			else {
				fuel = fuel+addF;
				return addF;
			}
		}
	}
	
	public int drive(int km) {
		boolean checkRented = getRented();
		double totalDistance = 20.0*fuel;
		if(checkRented == false) {
			return -2;
		}
		else {
			if(km > totalDistance) {
				return -1;
			}
			else {
				double consumedFuel = km/20.0;
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
