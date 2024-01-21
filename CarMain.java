
public class CarMain {

	public static void main(String[] args) {
		Car myCar = new Car(); //객체 생성
		myCar.maxSpeed = 60; //필드 값 변경
		System.out.println(myCar.company);
		System.out.println(myCar.model);
		System.out.println(myCar.speed); //0
		System.out.println(myCar.color);
		System.out.println(myCar.maxSpeed);
	}

}
