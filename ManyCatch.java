package sec10.exam;

public class ManyCatch {

	public static void main(String[] args) {
		try {
			String d1 = args[0];
			String d2 = args[1];
			int v1 = Integer.parseInt(d1);
			int v2 = Integer.parseInt(d2);
			int result = v1+v2;
			System.out.println(result);
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("실행 매개값의 수가 부족합니다."); //다중 catch는 하나만 실행된다.
		}
		catch(NumberFormatException e) {
			System.out.println("숫자로 변환할 수 없습니다.");
		}
		finally {
			System.out.println("다시 실행하세요.");
		}
	}

}
