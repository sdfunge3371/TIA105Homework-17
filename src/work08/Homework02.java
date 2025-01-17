package work08;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Objects;
import java.util.TreeSet;

public class Homework02 {

	public static void main(String[] args) {

		Train t1 = new Train(202, "普悠瑪", "樹林", "花蓮", 400);
		Train t2 = new Train(1254, "區間", "屏東", "基隆", 700);
		Train t3 = new Train(118, "自強", "高雄", "台北", 500);
		Train t4 = new Train(1288, "區間", "新竹", "基隆", 400);
		Train t5 = new Train(122, "自強", "台中", "花蓮", 600);
		Train t6 = new Train(1222, "區間", "樹林", "七堵", 300);
		Train t7 = new Train(1254, "區間", "屏東", "基隆", 700);

		System.out.println("印出不重複的Train物件");

		HashSet<Train> trains = new HashSet<>();

		trains.add(t1);
		trains.add(t2);
		trains.add(t3);
		trains.add(t4);
		trains.add(t5);
		trains.add(t6);
		trains.add(t7);

		Iterator<Train> iterator = trains.iterator();
		while (iterator.hasNext()) {
			Train train = iterator.next();
			System.out.println(train);
			System.out.println(train.getNumber());
		}

		System.out.println("讓Train物件印出時,能以班次編號由大到小印出");

		ArrayList<Train> trainsList = new ArrayList<>();
		trainsList.add(t1);
		trainsList.add(t2);
		trainsList.add(t3);
		trainsList.add(t4);
		trainsList.add(t5);
		trainsList.add(t6);
		trainsList.add(t7);
		Collections.sort(trainsList);
		
		for (Train train : trainsList) {
			System.out.println(train);
			System.out.println(train.getNumber());
		}

		System.out.println("不僅能讓班次編號由大排到小印出, 還可以不重複印出Train物件");

		TreeSet<Train> trainsSet = new TreeSet<>();
		trainsSet.add(t1);
		trainsSet.add(t2);
		trainsSet.add(t3);
		trainsSet.add(t4);
		trainsSet.add(t5);
		trainsSet.add(t6);
		trainsSet.add(t7);
		for (Train train : trainsSet) {
			System.out.println(train);
			System.out.println(train.getNumber());
		}

	}

}

class Train implements Comparable<Train> {

	private int number;

	@Override
	public int hashCode() {
		return Objects.hash(dest, number, price, start, type);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Train other = (Train) obj;
		return Objects.equals(dest, other.dest) && number == other.number
				&& Double.doubleToLongBits(price) == Double.doubleToLongBits(other.price)
				&& Objects.equals(start, other.start) && Objects.equals(type, other.type);
	}

	private String type;
	private String start;
	private String dest;
	private double price;

	public Train(int number, String type, String start, String dest, double price) {
		super();
		this.number = number;
		this.type = type;
		this.start = start;
		this.dest = dest;
		this.price = price;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getStart() {
		return start;
	}

	public void setStart(String start) {
		this.start = start;
	}

	public String getDest() {
		return dest;
	}

	public void setDest(String dest) {
		this.dest = dest;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public int compareTo(Train o) {
		if (this.number < o.number) {
			return 1;
		} else if (this.number == o.number) {
			return 0;
		} else {
			return -1;
		}

	}

}