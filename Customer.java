package sec07.exam01;

public class Customer implements Sell, Buy {
	public void sell() {
		System.out.println("Customoer sell");
	}
	public void buy() {
		System.out.println("Customer buy");
	}
	public void order() {
		System.out.println("Customer ordery");
	}
	public void hello() {
		System.out.println("hi");
	}
}
