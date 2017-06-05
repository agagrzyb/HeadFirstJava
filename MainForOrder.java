package sheet12xCoffeeShop;

public class MainForOrder {

	public static void main(String[] args) {
		Coffee c1 =	Coffee.AMERICANO;
		System.out.println("Coffee price : $" + c1.getCoffee());
		Coffee c2 =  Coffee.ESPRESSO;
		System.out.println("Coffee : " + c2);
		String [] coffees = {};
		
		Order ord1 = new Order(new String []{"americano"},
				Coffee.AMERICANO);
		System.out.println(ord1);
		
		Order ord2 = new Order(new String [] {"latte"},
				Coffee.LATTE);
		System.out.println(ord2);
		
		
		
	}
}
