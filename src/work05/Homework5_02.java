package work05;

public class Homework5_02 {

	public static void main(String[] args) {

		int[][] intArray = { { 1, 6, 3 }, { 9, 5, 2 } };

		double[][] doubleArray = { { 1.2, 3.5, 2.2 }, { 7.4, 2.1, 8.2 } };

		Homework5_02 w = new Homework5_02();
		System.out.println(w.maxElement(intArray));
		System.out.println(w.maxElement(doubleArray));

	}

	public int maxElement(int x[][]) {
		int maxValue = 0;
		for (int i = 0; i < x.length; i++) {
			for (int j = 0; j < x[i].length; j++) {
				if (x[i][j] >= maxValue) {
					maxValue = x[i][j];
				}
			}
		}
		return maxValue;
	}

	public double maxElement(double x[][]) {
		double maxValue = 0;
		for (int i = 0; i < x.length; i++) {
			for (int j = 0; j < x[i].length; j++) {
				if (x[i][j] >= maxValue) {
					maxValue = x[i][j];
				}
			}
		}
		return maxValue;
	}
}
