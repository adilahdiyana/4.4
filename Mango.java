package Exercise4_4;

public class Mango extends Fruit { //sub class for Fruit
	
	protected double weight;
	protected String size;
	protected double vitc;;
	
	public Mango(String name, double weight, String size, double vitc) {
		super(name);
		this.weight = weight;
		this.size = size;
		this.vitc = vitc;
		
		System.out.println("Manggo is contstructor invoked.");
		
		if(this.weight < 45) {
			totalVitc();
			System.out.println(name);
			System.out.println("Size of manggo\t: Small");
			System.out.println("If weight is LESS than 45, the total vitamin c of mango is " + totalVitc() + "g.");
		}
		
			else if(this.weight > 45 && this.weight < 65) {
				double vc = 23.1;
				totalVitc(vc);
				System.out.println(name);
				System.out.println("Size of mango\t: Medium");
				System.out.println("If weight is MORE than 45, the total vitamin c of mango is " + totalVitc() + "g.");
		}
		
			else {
				double vc = 15.2;
				int p = 3;
				totalVitc(vc, p);
				System.out.println(name);
				System.out.println("Size of mango\t: Big");
				System.out.println("If weight is MORE than 65, the total vitamin c of mango is " + totalVitc() + "g.");
		}
}
	
	public double totalVitc() {
		return this.weight*this.vitc;
	}
	
	public double totalVitc(double vc) {
		return vc*this.weight;
	}
	
	public double totalVitc(double vc, int p) {
		return vc*this.weight*p;
	}
} //end for class Mango
