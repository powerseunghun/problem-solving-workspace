package Practice;

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
public class StructureArrangement {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		ArrayList<Student> list = new ArrayList<>();
		
		for (int i = 0; i < n; i++) {
			list.add(new Student(i + 1, sc.nextInt(), sc.nextInt()));
		}
		
		for (int i = 0; i < list.size(); i++) {
			for (int j = 0; j < list.size() - (i + 1); j++) {
				Student tmp = null;
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
					tmp = new Student(list.get(j));
					list.get(j).num = list.get(j + 1).num;
					list.get(j).math = list.get(j + 1).math;
					list.get(j).info = list.get(j + 1).info;
					list.get(j + 1).num = tmp.num;
					list.get(j + 1).math = tmp.math;
					list.get(j + 1).info = tmp.info;
				}
			}
		}
		
		for (int i = 0 ; i < list.size(); i++) {
			System.out.println(list.get(i).num + " " + list.get(i).math + " " + list.get(i).info);
		}
	}
}
