package work1;

public class Homework1_3 {
	public static void main(String[] args) {

		System.out.println("256559為" + (256559 / 86400) + "天" + (256559 % 86400 / 3600) + "小時"
				+ (256559 % 86400 % 3600 / 60) + "分" + (256559 % 86400 % 3600 % 60) + "秒");

	}
}
