package work05;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Homework5_04 {

	public static void main(String[] args) {
		Homework5_04 w = new Homework5_04();
		System.out.println("本次隨機產生驗證碼為: ");
		System.out.println(w.genAuthCode());
	}

	public String genAuthCode() {

		// 決定英文大小寫以及數字的個數，加總為8
		int bigCharCount = (int) (Math.random() * 5) + 1;
		int smallCharCount = (int) (Math.random() * 2) + 1;
		int numCount = 8 - bigCharCount - smallCharCount;

		StringBuilder sb = new StringBuilder();

		// 隨機產生英文大小寫以及數字，並透過StringBuilder合併
		for (int i = 0; i < bigCharCount; i++) {
			String smalchar = String.valueOf((char) (int) (Math.random() * 25 + 65));
			sb.append((String) smalchar);
		}

		for (int j = 0; j < smallCharCount; j++) {
			String bigchar = String.valueOf((char) (int) (Math.random() * 25 + 97));
			sb.append((String) bigchar);
		}

		for (int k = 0; k < numCount; k++) {
			String numchar = String.valueOf((char) (int) (Math.random() * 10 + 48));
			sb.append((String) numchar);
		}

		// 將字符串轉成list後再透過Collections.shuffle隨機排序
		List<String> list = Arrays.asList(sb.toString().split(""));
		Collections.shuffle(list);
		// 建立新的StringBuilder，合併隨機排列後的字串
		StringBuilder resultSb = new StringBuilder();
		list.forEach(item -> resultSb.append(item));

		return resultSb.toString();

	}

}
