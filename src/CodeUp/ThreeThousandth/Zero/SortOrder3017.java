package CodeUp.ThreeThousandth.Zero;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;

class Student {
	int num;
	int math;
	int info;
	public Student() {
		this.num = 0;
		this.math = 0;
		this.info = 0;
	}
	public Student(int num, int math, int info) {
		super();
		this.num = num;
		this.math = math;
		this.info = info;
	}
	public Student(Student std) {
		this.num = std.num;
		this.math = std.math;
		this.info = std.info;
	}
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public int getMath() {
		return math;
	}
	public void setMath(int math) {
		this.math = math;
	}
	public int getInfo() {
		return info;
	}
	public void setInfo(int info) {
		this.info = info;
	}
	
}
public class SortOrder3017 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		ArrayList<Student> list = new ArrayList<>();
		String tmp = null;
		for (int i = 0; i < n; i++) {
			tmp = br.readLine();
			list.add(new Student(i+1, Integer.parseInt(tmp.split(" ")[0])
					, Integer.parseInt(tmp.split(" ")[1])));
		}
		
		for (int i = 0; i < list.size(); i++) {
			for (int j = 0; j < list.size() - (i + 1); j++) {
				Student tStd = null;
				boolean swap = false;
				if (list.get(j).math < list.get(j + 1).math) {
					swap = true;
				}
				else if(list.get(j).math == list.get(j + 1).math) {
					if (list.get(j).info < list.get(j + 1).info) {
						swap = true;
					}
				}
				if (swap) {
					tStd = new Student(list.get(j));
					list.get(j).num = list.get(j + 1).num;
					list.get(j).math = list.get(j + 1).math;
					list.get(j).info = list.get(j + 1).info;
					list.get(j + 1).num = tStd.num;
					list.get(j + 1).math = tStd.math;
					list.get(j + 1).info = tStd.info;
				}
			}
		}
		
		for (int i = 0 ; i < list.size(); i++) {
			System.out.println(list.get(i).num + " " + list.get(i).math + " " + list.get(i).info);
		}
	}
}
