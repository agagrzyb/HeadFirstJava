package sheet12xCoffeeShop;

import java.util.Arrays;

public class Order {
	//member variables
	private int orderNumber;
	private String [] coffees; // an array of Coffee Enum values
	private Coffee coffee;  //enum file
	//constructors
	public Order(){
		orderNumber++;
	}
	public Order(String [] coffees, Coffee coffee){
		this();
		this.coffees = coffees;
		this.coffee = coffee;
	}
	//methods, setters and getters
	public String[] getCoffees(){
		return coffees;
	} 
	public void setCoffees(String [] coffees){
		this.coffees = coffees;
	}
	//calculate price
	public double calculatePrice(){
		return coffee.getCoffee();
	}	
	//toString
	
	@Override
	public String toString() {
		return "Order Number = " + orderNumber + 
				", coffees = " + Arrays.toString(coffees) + 
				", coffee = " + coffee;
	}
}
