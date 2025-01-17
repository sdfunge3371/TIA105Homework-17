package work07;

import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Homework05 {

	public static void main(String[] args) throws ClassNotFoundException, IOException {

		String pathObject = "C:\\data\\Object.ser";
		File file1 = new File(pathObject);

		// 輸入
		FileInputStream fis = new FileInputStream(file1);
		ObjectInputStream ois = new ObjectInputStream(fis);
		System.out.println(file1.getName() + "檔案內容如下: ");
		System.out.println("--------------------");
		 try {
	            while (true) {
	                Object object = ois.readObject();
	                if (object.getClass() == Dog.class ) {
	                    ((Dog) object).speak();
	                } else if (object.getClass() == Cat.class) {
	                    ((Cat) object).speak();
	                }
	            }
	        } catch (EOFException e) {
	            System.out.println("資料讀取完畢！");;
	        }finally {
	            ois.close();
	            fis.close();
	        }

	}

}
