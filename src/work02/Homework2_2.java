package work02;

public class Homework2_2 {

	public static void main(String[] args) {

		int results = 0;
		for (int b = 1; b <= 49; b++) {
			String strNumber = Integer.toString(b);
			if (!strNumber.contains("4")) {
				System.out.print(strNumber + " ");
				results += 1;
			}
		}
		System.out.println();
		System.out.printf("總共有 %d 個符合的數字", results);
		System.out.println();

		for (int n = 10; n >= 0; n--) {
			for (int m = 1; m <= n; m++) {
				System.out.print(m + " ");
			}
			System.out.println();
		}

	}

}
