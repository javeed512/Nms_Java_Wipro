package strategy;

public class Client {

	public static void main(String[] args) {


		Item item1 = new Item("Iphone", 50000);
		Item item2 = new Item("Bag",2000);
		Item item3 = new Item("Book",500);
		
		
		
			ShoppingCart cart  = new ShoppingCart();
			
			cart.addItem(item1);
			cart.addItem(item2);
			cart.addItem(item3);
			
		//	cart.removeItem(item2);
		
			
			System.out.println(cart.viewAllItems());
			
			
	cart.pay(new CreditCardStrategy("javeed", "95432176543", "101", "19-06-2025"));
			
			//cart.pay(new  PaypalStrategy("javeed@gmail.com", "skafjd1244"));

	}

}
