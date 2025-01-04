package workExt.hw01;

public class InkBrush extends Pen {

	@Override
	public void write() {
		System.out.println("沾墨汁再寫");
	}
	
	@Override
	public double getPrice() {
		double price = super.getPrice();
		return price * 0.9;
	}

	public InkBrush(String brand, int price) {
		super(brand, price);

	}
}
