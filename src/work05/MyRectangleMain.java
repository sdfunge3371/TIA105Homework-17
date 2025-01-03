package work05;

public class MyRectangleMain {

	public static void main(String[] args) {
		MyRectangle rec = new MyRectangle();
		rec.setWidth(10);
		rec.setDepth(20);
		rec.getArea();
		MyRectangle rec2 = new MyRectangle(10, 20);
		rec2.getArea();
	}

}

class MyRectangle {
	private double width;
	private double depth;

	public void setWidth(double width) {
		this.width = width;
	}

	public void setDepth(double depth) {
		this.depth = depth;
	}

	public void getArea() {
		System.out.printf("長方形面積為 %.2f", this.width * this.depth);
		System.out.println();

	}

	public MyRectangle() {

	}

	public MyRectangle(double width, double depth) {
		this.width = width;
		this.depth = depth;
	}
}