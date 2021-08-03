package Acmicpc.GreedyAlgorithm.Thousandth.Nine;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.PriorityQueue;

class Test implements Comparable<Test>{
	private int score1;
	private int score2;
	public Test() {
		this.score1 = 0;
		this.score2 = 0;
	}
	public Test(int s1, int s2) {
		this.score1 = s1;
		this.score2 = s2;
	}
	public int getScore1() {
		return this.score1;
	}
	public int getScore2() {
		return this.score2;
	}
	@Override
	public int compareTo(Test o) {
		if (this.score1 == o.score1) return this.score2 - o.score2;
		else return this.score1 - o.score1;
	}
}
public class NewRecruits1946 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String tmp = null;
		StringBuilder sb = new StringBuilder();
		int T = Integer.parseInt(br.readLine()), N = 0, s1 = 0, s2 = 0, count = 0; 
		Test[] person = null;
		
		for (int i = 0; i < T; i++) {
			N = Integer.parseInt(br.readLine());
			person = new Test[N];
			for (int j = 0; j < N; j++) {
				tmp = br.readLine();
				s1 = Integer.parseInt(tmp.split(" ")[0]);
				s2 = Integer.parseInt(tmp.split(" ")[1]);
				person[j] = new Test(s1, s2);
			}
			Arrays.sort(person);
			Test base = person[0];
			count = 1;
			
			for (int j = 1; j < person.length; j++) {
				if (base.getScore2() > person[j].getScore2()) {
					count++;
					base = person[j];
				}
			}
			sb.append(count+"\n");
		}
		System.out.print(sb.toString());
	}
}
