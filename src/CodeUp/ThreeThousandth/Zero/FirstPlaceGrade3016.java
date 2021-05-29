package CodeUp.ThreeThousandth.Zero;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
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

public class FirstPlaceGrade3016 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine()), s = 0, t = 0;
		int[] seconds = new int[n];
		int[] thirds = new int[n];
		List<Std> list = new ArrayList<>();
		String tmp = null;
		
		for (int i = 0; i < n; i++) {
			tmp = br.readLine();
			String name = tmp.split(" ")[0];
			int first = Integer.parseInt(tmp.split(" ")[1]);
			int second = Integer.parseInt(tmp.split(" ")[2]);
			int third = Integer.parseInt(tmp.split(" ")[3]);
			list.add(new Std(name, first, second, third));
			seconds[i] = second;
			thirds[i] = third;
		}
		
		for (int i = 0; i < n; i++) {
			Std tStd = null;
			for (int j = 0; j < n - (i + 1); j++) {
				if (list.get(j).first < list.get(j+1).first) {
					tStd = new Std(list.get(j));
					list.get(j).name = list.get(j + 1).name;
					list.get(j).first = list.get(j + 1).first;
					list.get(j).second = list.get(j + 1).second;
					list.get(j).third = list.get(j + 1).third;
					list.get(j + 1).name = tStd.name;
					list.get(j + 1).first = tStd.first;
					list.get(j + 1).second = tStd.second;
					list.get(j + 1).third = tStd.third;
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
