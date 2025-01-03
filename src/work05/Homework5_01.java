package work05;

import java.util.Scanner;

public class Homework5_01 {

	public static void main(String[] args) {

		starSquare();
		randAvg();
	}

	public static void starSquare() {

		Scanner scanner = new Scanner(System.in);
		System.out.println("請輸入寬與高: ");
		int width = scanner.nextInt();
		int height = scanner.nextInt();
		for (int i = 0; i < height; i++) {
			for (int j = 0; j < width; j++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

	public static void randAvg() {
		int sum = 0;
		System.out.println("本次亂數結果: ");
		for (int i = 0; i < 10; i++) {
			int rand = (int) (Math.random() * 101);
			sum += rand;
			System.out.print(rand + " ");
		}
		System.out.println();
		System.out.println(sum / 10);
	}

}
