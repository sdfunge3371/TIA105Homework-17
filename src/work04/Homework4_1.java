package work04;

import java.util.stream.IntStream;

public class Homework4_1 {

	public static void main(String[] args) {
		
		// 第一題
		// 輸出此陣列所有元素的平均值與大於平均值的元素
		int[] problem1 = { 29, 100, 39, 41, 50, 8, 66, 77, 95, 15 };
		double aveNumber = IntStream.of(problem1).average().orElse(0.0);

		System.out.printf("此陣列所有元素的平均值為: %.1f", aveNumber);
		System.out.println();
		System.out.print("大於平均值的元素為: ");

		for (int i = 0; i < problem1.length; i++) {
			if (problem1[i] > aveNumber) {
				System.out.print(problem1[i] + " ");
			}
		}
		System.out.println();

		// 第二題
		String s = "Hello World";
		String[] s_list = s.split("");
		// System.out.print(s_list.length);
		for (int j = s_list.length - 1; j >= 0; j--) {
			System.out.print(s_list[j]);
		}
		System.out.println();
				
		// 第三題
		String[] problem3 = { "mercury", "venus", "earth", "mars", "jupiter", "saturn", "uranus", "neptune" };
		String[] vowel = { "a", "e", "i", "o", "u" };
		int result = 0;
		for (int k = 0; k < problem3.length; k++) {
			for (int m = 0; m < vowel.length; m++) {
				if (problem3[k].contains(vowel[m])) {
					result += 1;
				}
			}
		}
		System.out.printf("這陣列裡面共有 %d 個母音",result);

	}
}

