package work02;

public class Homework2_1 {

	public static void main(String[] args) {

		int sum = 0;
		for (int i = 1; i <= 1000; i++) {
			if (i % 2 == 0) {
				sum += i;
			}
		}

		int product1 = 1;
		for (int j = 1; j <= 10; j++) {
			product1 = product1 * j;
		}

		int product2 = 1;
		int k = 1;
		while (k <= 10) {
			product2 = product2 * k;
			k++;
		}

		System.out.printf("1~1000的偶數和為 %d", sum);
		System.out.println();
		System.out.printf("1~10的連乘積為 %d", product1);
		System.out.println();
		System.out.printf("1~10的連乘積 %d", product2);
		System.out.println();

		for (int g = 1; g <= 10; g++) {
			System.out.print((int) Math.pow(g, 2) + " ");
		}
		System.out.println();

	}

}
