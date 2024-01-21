
public class KoreanMain {

	public static void main(String[] args) {
		// 객체 생성 후 필드 값 출력
		Korean k1 = new Korean("홍길동","010-1234-5678");
		System.out.println(k1.name);
		System.out.println(k1.ssn);
		
		Korean k2 = new Korean("홍홍홍","010-2222-3333");
		System.out.println(k2.name);
		System.out.println(k2.ssn);
	}

}
