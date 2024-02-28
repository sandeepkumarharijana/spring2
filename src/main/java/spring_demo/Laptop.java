package spring_demo;

public class Laptop {
	 private String brand;
	  private double price;
	  private int ram;
	  private Sim sim;
	public Laptop(String brand, double price, int ram,Sim sim) {
		
		this.brand = brand;
		this.price = price;
		this.ram = ram;
		this.sim = sim;
	}
	@Override
	public String toString() {
		return "Laptop [brand=" + brand + ", price=" + price + ", ram=" + ram + ", sim=" + sim + "]";
	}
	
	
	
}
