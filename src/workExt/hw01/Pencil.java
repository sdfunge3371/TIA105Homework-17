package workExt.hw01;

public class Pencil extends Pen {

	@Override
	public void write() {
		System.out.println("削鉛筆再寫");
	}

	@Override
	public double getPrice() {
		// price = (int) (price * 0.8);
		double price = super.getPrice();
		return price * 0.8;
	}

	public Pencil(String brand, int price) {
		super(brand, price);
	}

}
