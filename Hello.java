package chap01; 

    
   public class Hello {

	public static void main(String[] args) {
		
		int ball =(int) (Math.random()*6)+1; //1부터 시작하는 정수 6개를 무작위로 뽑기
		
		switch(ball)
		{
		case 1:
			System.out.println("1번째 공입니다.");
			break; //실행문 빠져나감
		case 2:
			System.out.println("2번째 공입니다.");
			break;
		case 3:
			System.out.println("3번째 공입니다.");
			break; //실행문 빠져나감
		case 4:
			System.out.println("4번째 공입니다.");
			break;
		case 5:
			System.out.println("5번째 공입니다.");
			break; //실행문 빠져나감
		default:
			System.out.println("6번째 공입니다.");
			
		}
	 
	}
	
}