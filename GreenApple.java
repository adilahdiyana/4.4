package Exercise4_4;

public class GreenApple extends Apple { //sub class for Apple
	
	protected String brand;
	protected String taste;
	
	public GreenApple(String name, double price, int quantity, String brand, String taste) { 
		super(name, price, quantity);
		this.brand = brand;
		this.taste = taste;
		
		System.out.println("Green Apple constructor is invoked.");
	}

	public String brandGreenApple() {
		return this.brand;
	}
	
	public String tasteGreenApple() {
		return this.taste;
	}
		
	public double calPrice() { //overriding method from class Apple
		return super.price*super.quantity;
	}
} //end for class GreenApple
