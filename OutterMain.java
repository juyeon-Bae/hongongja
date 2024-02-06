package sec09.exam;

public class OutterMain {

	public static void main(String[] args) {
		 
		 Outter outter = new Outter(); //바깥
		 Outter.Nested nested = outter.new Nested();//안쪽
		 
		 nested.print();

	}

}


