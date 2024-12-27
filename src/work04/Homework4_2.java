package work04;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Homework4_2 {

	public static void main(String[] args) {
		Map<Integer, Integer> moneys = new HashMap<Integer, Integer>();
		moneys.put(25, 2500);
		moneys.put(32, 800);
		moneys.put(8, 500);
		moneys.put(19, 1000);
		moneys.put(27, 1200);

		Scanner scanner = new Scanner(System.in);
		System.out.println("請輸入欲借金額");
		int borrowMoney = scanner.nextInt();

		int result = 0;
		System.out.print("有錢可借的員工編號: ");
		for (Integer key : moneys.keySet()) {
			if (moneys.get(key) > borrowMoney) {
				System.out.print(key+" ");
				result += 1;
			}
		}
		System.out.printf("共 %d 人",result);
	}

}
