package workExt.hw01;

public abstract class Pen {

	private String brand;
	private int price;

	public Pen() {

	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public Pen(String brand, int price) {
		this.brand = brand;
		this.price = price;
	}

	public abstract void write();
}
