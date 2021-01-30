package Practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

class Std {
	String name;
	int first;
	int second;
	int third;
	
	public Std(Std s) {
		this.name = s.name;
		this.first = s.first;
		this.second = s.second;
		this.third = s.third;
	}
	
	public Std(String name, int first, int second, int third) {
		super();
		this.name = name;
		this.first = first;
		this.second = second;
		this.third = third;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getFirst() {
		return first;
	}
	public void setFirst(int first) {
		this.first = first;
	}
	public int getSecond() {
		return second;
	}
	public void setSecond(int second) {
		this.second = second;
	}
	public int getThird() {
		return third;
	}
	public void setThird(int third) {
		this.third = third;
	}
}

public class GradeCardPrintWithOrder {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(), s = 0, t = 0;
		int[] seconds = new int[n];
		int[] thirds = new int[n];
		List<Std> list = new ArrayList<>();
		
		for (int i = 0; i < n; i++) {
			String name = sc.next();
			int first = sc.nextInt();
			int second = sc.nextInt();
			int third = sc.nextInt();
			list.add(new Std(name, first, second, third));
			seconds[i] = second;
			thirds[i] = third;
		}
		
		for (int i = 0; i < n; i++) {
			Std tmp = null;
			for (int j = 0; j < n - (i + 1); j++) {
				if (list.get(j).first < list.get(j+1).first) {
					tmp = new Std(list.get(j));
					list.get(j).name = list.get(j + 1).name;
					list.get(j).first = list.get(j + 1).first;
					list.get(j).second = list.get(j + 1).second;
					list.get(j).third = list.get(j + 1).third;
					list.get(j + 1).name = tmp.name;
					list.get(j + 1).first = tmp.first;
					list.get(j + 1).second = tmp.second;
					list.get(j + 1).third = tmp.third;
				}
			}
		}
		Arrays.sort(seconds);
		Arrays.sort(thirds);
		
		for (int i = 0; i < seconds.length; i++) {
			if (seconds[i] == list.get(0).second) {
				s = seconds.length - i;
			}
		}
		for (int i = 0; i < thirds.length; i++) {
			if (thirds[i] == list.get(0).third) {
				t = thirds.length - i;
			}
		}
		System.out.println(list.get(0).name + " " + s + " " + t);
	}
}
