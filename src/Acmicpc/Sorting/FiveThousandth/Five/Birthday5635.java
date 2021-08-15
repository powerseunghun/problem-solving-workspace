package Acmicpc.Sorting.FiveThousandth.Five;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

class Person {
	private String name;
	private int month;
	private int day;
	private int year;
	
	public Person(String n, int d, int m, int y) {
		this.name = n;
		this.day = d;
		this.month = m;
		this.year = y;
	}
	public String getName() {
		return this.name;
	}
	public int getMonth() {
		return this.month;
	}
	public int getDay() {
		return this.day;
	}
	public int getYear() {
		return this.year;
	}
}
public class Birthday5635 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = null;
		StringBuilder sb = new StringBuilder();
		String name = null;
		int N = Integer.parseInt(br.readLine());
		Person[] ps = new Person[N];
		
		for (int i = 0, d = 0, m = 0, y = 0; i < N; i++) {
			st = new StringTokenizer(br.readLine());
			name = st.nextToken();
			d = Integer.parseInt(st.nextToken());
			m = Integer.parseInt(st.nextToken());
			y = Integer.parseInt(st.nextToken());
			ps[i] = new Person(name, d, m, y);
		}
		Arrays.sort(ps, new Comparator<Person>() {
			@Override
			public int compare(Person o1, Person o2) {
				if (o1.getYear() == o2.getYear() && o1.getMonth() == o2.getMonth()) {
					return o2.getDay() - o1.getDay();
				}
				else if (o1.getYear() == o2.getYear()) {
					return o2.getMonth() - o1.getMonth();
				}
				else {
					return o2.getYear() - o1.getYear();
				}
			}
		});
		sb.append(ps[0].getName() + "\n");
		Arrays.sort(ps, new Comparator<Person>() {
			@Override
			public int compare(Person o1, Person o2) {
				if (o1.getYear() == o2.getYear() && o1.getMonth() == o2.getMonth()) {
					return o1.getDay() - o2.getDay();
				}
				else if (o1.getYear() == o2.getYear()) {
					return o1.getMonth() - o2.getMonth();
				}
				else {
					return o1.getYear() - o2.getYear();
				}
			}
		});
		sb.append(ps[0].getName() + "\n");
		System.out.print(sb.toString());
	}
}
