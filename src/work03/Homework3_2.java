package work03;

import java.util.Scanner;

public class Homework3_2 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		int ans = (int) (Math.random() * 9) + 1;
		System.out.println("開始猜數字吧!");
		int guessNumber = scanner.nextInt();
		// System.out.println(ans);
		do {
			System.out.println("猜錯囉");
			guessNumber = scanner.nextInt();
		} while (guessNumber != ans);

		System.out.printf("答對了! 答案就是 %d", ans);
		System.out.println();

	}

}
