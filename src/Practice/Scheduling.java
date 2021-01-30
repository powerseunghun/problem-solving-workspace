package Practice;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Schedule {
	String work;
	String date;
	
	public Schedule() {
		this.work = "";
		this.date = "";
	}
	
	public Schedule(String work, String date) {
		this.work = work;
		this.date = date;
	}
	
	public Schedule(Schedule s) {
		this.work = s.work;
		this.date = s.date;
	}
	
	public String getWork() {
		return work;
	}
	public void setWork(String work) {
		this.work = work;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	
}
public class Scheduling {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String s = "";
		boolean swap = true;
		List<Schedule> list = new ArrayList<>();
		
		for (int i = 0; i < n; i++) {
			list.add(new Schedule(sc.next(), sc.nextLine().replaceAll(" ", "")));
			if (list.get(i).getDate().length() != 8) {
				s = "";
				for (int j = 0; j < 8 - list.get(i).getDate().length(); j++) {
					s += "0";
				}
				list.get(i).setDate(s + list.get(i).getDate());
			}
		}
		
		for (int i = 0; i < list.size(); i++) {
			Schedule tmp = null;
			for (int j = 0; j < list.size() - (i + 1); j++) {
				swap = false;
				if (list.get(j).getDate().compareTo(list.get(j + 1).getDate()) > 0) {
					swap = true;
				}
				else if (list.get(j).getDate().compareTo(list.get(j + 1).getDate()) == 0) {
					if (list.get(j).getWork().compareTo(list.get(j + 1).getWork()) > 0) {
						swap = true;
					}
				}
				if (swap) {
					tmp = new Schedule(list.get(j));
					list.get(j).setWork(list.get(j + 1).getWork());
					list.get(j).setDate(list.get(j + 1).getDate());
					list.get(j + 1).setWork(tmp.getWork());
					list.get(j + 1).setDate(tmp.getDate());
				}
			}
		}
		
		for (int i = 0; i < n; i++) {
			System.out.println(list.get(i).getWork());
		}
		
	}
}
