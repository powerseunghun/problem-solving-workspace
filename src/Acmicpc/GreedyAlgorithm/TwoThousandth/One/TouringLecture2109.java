package Acmicpc.GreedyAlgorithm.TwoThousandth.One;

import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.io.BufferedReader;
import java.io.IOException;

class Lecture {
	private int cost;
	private int day;
	
	public Lecture() {
		this.cost = 0;
		this.day = 0;
	}
	public Lecture(int c, int d) {
		this.cost = c;
		this.day = d;
	}
	
	public int getCost() {
		return this.cost;
	}
	public int getDay() {
		return this.day;
	}
}
public class TouringLecture2109 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String tmp = null;
		int n = Integer.parseInt(br.readLine()), sum = 0;
		int[] date = new int[10001];
		Lecture[] lecs = new Lecture[n];
		for (int i = 0, c = 0, d = 0; i < lecs.length; i++) {
			tmp = br.readLine();
			c = Integer.parseInt(tmp.split(" ")[0]);
			d = Integer.parseInt(tmp.split(" ")[1]);
			lecs[i] = new Lecture(c, d);
		}
		Arrays.sort(lecs, new Comparator<Lecture>() {
			@Override
			public int compare(Lecture o1, Lecture o2) {
				if (o1.getCost() == o2.getCost()) {
					return o2.getDay() - o1.getDay(); 
				}
				else return o2.getCost() - o1.getCost();
			}
		});
		for (int i = 0; i < n; i++) {
			for (int j = lecs[i].getDay(); j >= 1; j--) {
				if (date[j] == 0) {
					date[j] = 1;
					sum += lecs[i].getCost();
					break;
				}
			}
		}
		System.out.println(sum);
	}
}
