package work07;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Homework03 {

	public static void main(String[] args) throws IOException {

		File inputFile = new File("src/work07/InputData.txt");
		File outputFile = new File("src/work07/OutputData.txt");
		copyFile(inputFile, outputFile);
	}

	static void copyFile(File x, File y) throws IOException {

		FileInputStream in = new FileInputStream(x);
		FileOutputStream out = new FileOutputStream(y);
		int c;

		int i = 0;
		byte ch[] = new byte[(int) x.length()];
		while ((c = in.read()) != -1) {
			out.write(c);
			ch[i++] = (byte) c;
		}
		System.out.print(new String(ch));
		System.out.flush();

		in.close();
		out.close();

	}

}
