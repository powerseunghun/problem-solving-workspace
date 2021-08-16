package Acmicpc.Sorting.TwoThousandth.Five;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

class Person implements Comparable<Person> {
	private int country;
	private int num;
	private int score;
	public Person(int c, int n, int s) {
		this.country = c;
		this.num = n;
		this.score = s;
	}
	public int getCountry() {
		return this.country;
	}
	public int getNum() {
		return this.num;
	}
	public int getScore() {
		return this.score;
	}
	@Override
	public int compareTo(Person o) {
		return o.getScore() - this.getScore();
	}
}
public class AsiaOlympiad2535 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Map<Integer, Integer> map = new HashMap<>();
		StringTokenizer st = null;
		StringBuilder sb = new StringBuilder();
		int N = Integer.parseInt(br.readLine()), count = 0;
		Person[] people = new Person[N];
		
		for (int i = 0, c = 0, n = 0, s = 0; i < N;i ++) {
			st = new StringTokenizer(br.readLine());
			c = Integer.parseInt(st.nextToken());
			n = Integer.parseInt(st.nextToken());
			s = Integer.parseInt(st.nextToken());
			people[i] = new Person(c, n, s);
		}
		Arrays.sort(people);
		
		for (int i = 0, country = 0; i < people.length; i++) {
			country = people[i].getCountry();
			if(!map.containsKey(country)) {
				count++;
				map.put(country, 1);
			}
			else {
				if (map.get(country) >= 2) continue;
				count++;
				map.put(country, map.get(country)+1);
			}
			sb.append(people[i].getCountry() + " " + people[i].getNum() + "\n");
			if (count == 3) break;
//			System.out.println(people[i].getCountry() + " " + people[i].getNum() + " " + people[i].getScore());
		}
		System.out.print(sb.toString());
	}
}
