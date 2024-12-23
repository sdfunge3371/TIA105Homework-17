package work02;

public class Homework2_3 {

	public static void main(String[] args) {

		for (int n = 0; n <= 6; n++) {
			String cchar = String.valueOf((char) (96 + n)).toUpperCase();
			for (int m = 1; m <= n; m++) {
				System.out.print(cchar + " ");
			}
			System.out.println();
		}

	}

}
