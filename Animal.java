package sec03.exam02;

public abstract class Animal {
  public String kind; //필드
	  
	  public void breath() {
		  System.out.println("숨을 쉽니다."); //메소드
	  }
	  public abstract void sound(); //추상 메소드

}
