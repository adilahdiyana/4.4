package Exercise4_4;

public class RedApple extends Apple { //sub class for Apple
	
	protected String colour;
	protected double mass;
	
	public RedApple(String name, double price, int quantity, String colour, double mass) {
		super(name, price, quantity);
		this.colour = colour;
		this.mass = mass;
	
		System.out.println("Red Apple is constructor invoked.");
	}

	public String colourRedApple() {
		return colour;
	}
	
	public double mass() {
		return mass;
	}
	
	public double calcPrice() { //overriding method 
		return super.price*super.quantity*this.mass;
	}
} //end for class RedApple
