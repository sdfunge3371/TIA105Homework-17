package work07;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Homework02 {

	public static void main(String[] args) {
		try {
			FileWriter fw = new FileWriter("src/work07/Data.txt",true);

			BufferedWriter bw = new BufferedWriter(fw);

			PrintWriter pw = new PrintWriter(bw);

			
			Set randonNums = new HashSet();
			while (randonNums.size() < 10) {
				randonNums.add((int) (Math.random() * 1000 + 1));
			}
			
			Iterator objs = randonNums.iterator();
			while (objs.hasNext()) {
				pw.write(objs.next().toString());
				pw.write(" ");
			}
				
			pw.close();
			bw.close();
			fw.close();

		} catch (IOException e) {
			System.err.println(e);
		}

	}

}
