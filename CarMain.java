package sec08.exam;

public class CarMain {

	public static void main(String[] args) {
		Car mycar = new Car();
		
		mycar.run(); //HkTire
		
		mycar.frontLeftTire = new GhTire();
		mycar.frontRightTire = new GhTire();
		
		mycar.run();
	}

}
