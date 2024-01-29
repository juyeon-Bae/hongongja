package sec07.exam01;

public class CustomerMain {

	public static void main(String[] args) {
		 Customer customer = new Customer();
		 
		 customer.buy();
		 customer.sell();
		 customer.order();
		 customer.hello();
		 
		 Buy buyer = customer;
		 buyer.buy();
		 buyer.order();
		 
		 Sell seller = customer;
		 seller.sell();	
		 seller.order();
	}

}
