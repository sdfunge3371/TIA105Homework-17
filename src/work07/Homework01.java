package work07;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Homework01 {

	public static void main(String[] args) throws IOException {

		int rows = 0;
		int totalWords = 0;
		String rowStr;

		try {
			File myDir = new File("src/work07/Sample.txt");
			FileReader in = new FileReader(myDir);
			BufferedReader buin = new BufferedReader(in);

			while ((rowStr = buin.readLine()) != null) {
				rows += 1;
				totalWords += rowStr.length();

			}

//			while ((c = buin.read()) != -1) {
//				System.out.print((char) c);
//				totalWords += 1;
//			}

			buin.close();
			in.close();

			System.out.println(rows);
			System.out.println(totalWords);
			System.out.println(myDir.length());

		} catch (IOException e) {
		}

//		while (buin.readLine() != null) {
//			rows+=1;
//		}

//		while ((c = in.read()) != -1) {
//			totalWords+=1;
//		}

	}

}
