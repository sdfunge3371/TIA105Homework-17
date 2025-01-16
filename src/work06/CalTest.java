package work06;

import java.util.InputMismatchException;
import java.util.Scanner;

public class CalTest {

	public static void main(String[] args) throws CalException, InputMismatchException {
		Scanner scanner = new Scanner(System.in);
		System.out.println("請輸入x的值");
		String str1 = scanner.next();

		while (!str1.matches("\\d+")) {
			System.out.println("輸入格式不正確");
			System.out.println("請輸入x的值");
			str1 = scanner.next();
		}

		int x = Integer.parseInt(str1);

		System.out.println("請輸入y的值");
		String str2 = scanner.next();

		while (!str2.matches("\\d+")) {
			System.out.println("輸入格式不正確");
			System.out.println("請輸入y的值");
			str2 = scanner.next();
		}

		int y = Integer.parseInt(str2);

		Calculator cal = new Calculator(x, y);
		cal.powerXY(x, y);

	}

}
