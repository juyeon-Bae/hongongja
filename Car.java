package sec08.exam;

public class Car {
		//4개의 HkTire 타입 필드를 가짐
		Tire frontLeftTire = new HkTire();
		Tire frontRightTire = new HkTire();
		Tire backLeftTire = new HkTire();
		Tire backRightTire = new HkTire();
	
	void run() {
		// 인터페이스에서 설명된 roll() 메소드 호출
		frontLeftTire.roll();
		frontRightTire.roll();
		backLeftTire.roll();
		backRightTire.roll();
	}
}
