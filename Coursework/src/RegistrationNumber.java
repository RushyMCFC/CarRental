
public class RegistrationNumber {

	public String getRegNumber() {
		// TODO Auto-generated method stub
		return null;
	}
	
	public static void main(String[] args) {
		Car obj = new LargeCar(new RegistrationNumber(),55.0);
		
		System.out.println(obj.drive(95));
		System.out.println(obj);
	}

}
