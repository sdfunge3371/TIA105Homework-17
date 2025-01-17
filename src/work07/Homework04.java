package work07;

import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

/*
 * 請寫一支程式,利用老師提供的Dog與Cat類別分別產生兩個物件,寫到C:\data\Object.ser裡。注
意物件寫入需注意的事項,若C:\內沒有data資料夾,請用程式新增這個資料夾
 */
public class Homework04 {

	public static void main(String[] args) throws IOException {

		String pathData = "C:\\data";
		String pathObject = "C:\\data\\Object.ser";
		File file = new File(pathData);

		if (!file.exists()) {
			file.mkdir();
		}
		File file1 = new File(pathObject);

		Cat cat = new Cat("Cat", 20.0);
		Cat bigCat = new Cat("bigCat", 40.0);
		Dog dog = new Dog("Dog", 30.0);
		Dog bigDog = new Dog("bigDog", 60.0);

		// 輸出
		FileOutputStream fos = new FileOutputStream(file1);
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(cat);
		oos.writeObject(dog);
		oos.writeObject(bigCat);
		oos.writeObject(bigDog);
		oos.close();
		fos.close();

	}

}

class Cat implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private String name;

	private double weight;

	public Cat() {

	}

	public Cat(String name, double weight) {
		this.name = name;
		this.weight = weight;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	void speak() {
		System.out.printf("名字: %s", this.name);
		System.out.println();
		System.out.printf("體重: %.2f", this.weight);
		System.out.println();
	}
}

class Dog implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private String name;

	private double weight;

	public Dog() {

	}

	public Dog(String name, double weight) {
		this.name = name;
		this.weight = weight;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}
	
	void speak() {
		System.out.printf("名字: %s", this.name);
		System.out.println();
		System.out.printf("體重: %.2f", this.weight);
		System.out.println();
	}

}