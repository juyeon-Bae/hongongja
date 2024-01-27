package sec03.exam02;

public class AnimalMain {

	public static void main(String[] args) {
		Dog dog = new Dog();
		Cat cat = new Cat();
		dog.sound();
		cat.sound();
		System.out.println("--");
		
		Animal animal = null; //자동 타입 변환 
		animal = new Dog();  
		animal.sound();// 재정의 된 메소드 호출
		animal = new Cat();
		animal.sound();
		System.out.println("--");
		
		 animalSound(new Dog());
		 animalSound(new Cat());
	}
	public static void animalSound(Animal animal) {
		animal.sound();
	}
	 

}
