package work03;

import java.util.Scanner;

public class Homework3_1 {

	public static void main(String[] args) {

		System.out.println("請輸入三個整數:");
		Scanner scanner = new Scanner(System.in);
		int inputTrian1 = scanner.nextInt();
		int inputTrian2 = scanner.nextInt();
		int inputTrian3 = scanner.nextInt();

		if (inputTrian1 + inputTrian2 <= inputTrian3 || inputTrian1 + inputTrian3 <= inputTrian2
				|| inputTrian3 + inputTrian2 <= inputTrian1) {
			System.out.println("不是三角形");
		} else if (inputTrian1 == inputTrian2 && inputTrian2 == inputTrian3) {
			System.out.println("正三角形");
		} else if (inputTrian1 == inputTrian2 || inputTrian2 == inputTrian3 || inputTrian1 == inputTrian3) {
			System.out.println("等腰三角形");
		} else {
			System.out.println("其他三角形");
		}
		System.out.println();

	}

}
