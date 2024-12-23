package work03;

import java.util.Scanner;

public class Homework3_3 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("阿文...請輸入你討厭哪個數字");
		int hateNumber = scanner.nextInt();

		int results = 0;
		for (int b = 1; b <= 49; b++) {
			String strNumber = Integer.toString(b);
			if (!strNumber.contains(String.valueOf(hateNumber))) {
				if (results % 6 == 0) {
					System.out.println();
				}
				System.out.print(strNumber + " ");
				results += 1;
			}
		}
		System.out.println();
		System.out.printf("總共有 %d 個符合的數字", results);
		System.out.println();

	}

}
