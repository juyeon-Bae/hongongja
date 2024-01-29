package sec07.exam01;

public interface Sell {
	void sell();
	default void order() {
		System.out.println("Sell order");
	}
}
