package Acmicpc.Sorting.EightThousandth.Nine;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

class Nation {
	private int n;
	private int gold;
	private int silver;
	private int bronze;
	private int rank;
	public Nation(int n, int g, int s, int b) {
		this.n = n;
		this.gold = g;
		this.silver = s;
		this.bronze = b;
		this.rank = 1;
	}
	public int getN() {
		return this.n;
	}
	public int getGold() {
		return this.gold;
	}
	public int getSilver() {
		return this.silver;
	}
	public int getBronze() {
		return this.bronze;
	}
	public int getRank() {
		return this.rank;
	}
	public void setRank(int r) {
		this.rank = r;
	}
}
public class Olympic8979 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String tmp = br.readLine();
		StringTokenizer st = null;
		int N = Integer.parseInt(tmp.split(" ")[0]);
		Nation[] nat = new Nation[N];
		int K = Integer.parseInt(tmp.split(" ")[1]);
		
		for (int i = 0, n = 0, g = 0, s = 0, b = 0; i < nat.length; i++) {
			st = new StringTokenizer(br.readLine());
			n = Integer.parseInt(st.nextToken());
			g = Integer.parseInt(st.nextToken());
			s = Integer.parseInt(st.nextToken());
			b = Integer.parseInt(st.nextToken());
			nat[i] = new Nation(n, g, s, b);
		}
		
		for (int i = 0; i < nat.length; i++) {
			for (int j = 0; j < nat.length; j++) {
				if (i == j) continue;
				if (nat[i].getGold() == nat[j].getGold()) {
					if (nat[i].getSilver() < nat[j].getSilver()) {
						nat[i].setRank(nat[i].getRank()+1);
					}
					else if (nat[i].getSilver() == nat[j].getSilver()) {
						if (nat[i].getBronze() < nat[j].getBronze()) {
							nat[i].setRank(nat[i].getRank()+1);
						}
					}
				}
				else if (nat[i].getGold() < nat[j].getGold()) {
					nat[i].setRank(nat[i].getRank()+1);
				}
			}
		}
		for (int i = 0; i < nat.length; i++) {
			if (nat[i].getN() == K) {
				System.out.println(nat[i].getRank());
			}
			System.out.println(nat[i].getN() + " : " + nat[i].getGold() + " " + nat[i].getSilver() + " " + nat[i].getBronze() + " " + nat[i].getRank() + "등");
		}
	}
}
