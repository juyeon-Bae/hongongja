
public class myCar {
	//필드
	String company = "현대자동차";
	String model;
	String color;
	int maxSpeed;

	//생성자
	myCar(){
		
	}
	 myCar(String model){
		this.model = model;
	}
	myCar(String model, String color){ //생성자 오버로딩 : 매개 변수를 달리하는 생성자를 여러 개 선언
		this.model = model;
		this.color = color;
	}
	myCar(String model, String color, int maxSpeed){
		this.model = model;
		this.color = color;
		this.maxSpeed = maxSpeed;
	}
	
}
