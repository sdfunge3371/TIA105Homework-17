package workExt.hw01;

public class Homework01 {

	public static void main(String[] args) {
		Pencil pencil = new Pencil("Lion", 300);
		InkBrush inkbrush = new InkBrush("Lion", 500);

		System.out.println(pencil.getPrice());
		System.out.println(inkbrush.getPrice());
		
	}

}
