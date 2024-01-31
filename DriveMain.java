package sec08.exam;

public class DriveMain {

	public static void main(String[] args) {
		Driver driver = new Driver();
		
		Bus bus = new Bus();
		Taxi taxi = new Taxi();
		
		driver.drive(bus); //자동 타입 변환 : Vehicle vehicle = bus;
		driver.drive(taxi); //자동 타입 변환 : Vehicle vehicle = taxi;

	}

}
