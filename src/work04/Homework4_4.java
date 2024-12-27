package work04;

import java.util.Arrays;

public class Homework4_4 {

	public static void main(String[] args) {

		int[] highestTime = { 0, 0, 0, 0, 0, 0, 0, 0 };

		int[][] table = { { 10, 35, 40, 100, 90, 85, 75, 70 }, { 37, 75, 77, 89, 64, 75, 70, 95 },
				{ 100, 70, 79, 90, 75, 70, 79, 90 }, { 77, 95, 70, 89, 60, 75, 85, 89 },
				{ 98, 70, 89, 90, 75, 90, 89, 90 }, { 90, 80, 100, 75, 50, 20, 99, 75 } };

		for (int i = 0; i < table.length; i++) {
			int maxScore = Arrays.stream(table[i]).max().orElse(0);
			for (int j = 0; j < table[i].length; j++) {
				if (table[i][j] >= maxScore) {
					highestTime[j] += 1;
				}
			}
		}
		System.out.println("1號到8號同學，考最高分的次數依序如下:");
		for (Integer times : highestTime) {
			System.out.print(times + " ");
		}

	}
}