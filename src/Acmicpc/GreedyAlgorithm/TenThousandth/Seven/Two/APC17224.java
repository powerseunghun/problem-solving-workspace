package Acmicpc.GreedyAlgorithm.TenThousandth.Seven.Two;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;

class Problem {
	private int easy;
	private int high;
	public Problem() {
		this.easy = 0;
		this.high = 0; 
	}
	
	public Problem(int e, int h) {
		this.easy = e;
		this.high = h;
	}
	public void setEasy(int e) {
		this.easy = e;
	}
	public int getEasy() {
		return this.easy;
	}
	public int getHigh() {
		return this.high;
	}
}
public class APC17224 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String tmp = br.readLine();
		int N = Integer.parseInt(tmp.split(" ")[0]);
		int L = Integer.parseInt(tmp.split(" ")[1]);
		int K = Integer.parseInt(tmp.split(" ")[2]);
		int sum = 0, count = 0;
		Problem[] ps = new Problem[N];
		for (int i = 0, easy = 0, high = 0; i < ps.length; i++) {
			tmp = br.readLine();
			easy = Integer.parseInt(tmp.split(" ")[0]);
			high = Integer.parseInt(tmp.split(" ")[1]);
			ps[i] = new Problem(easy, high);
		}
		Arrays.sort(ps, new Comparator<Problem>() {
			@Override
			public int compare(Problem o1, Problem o2) {
				if (o1.getHigh() != o2.getHigh()) {
					return o1.getHigh() - o2.getHigh();
				}
				else return o1.getEasy() - o2.getEasy();
			}
		});
		for (int i = 0; i < ps.length; i++) {
			if (ps[i].getHigh() <= L) {
				sum += 140;
				ps[i].setEasy(L+1);
				count++;
			}
			else break;
			if (count == K) break;
		}
		
		if (count < K) {
			for (Problem p : ps) {
				if (p.getEasy() <= L) {
					sum += 100;
					count++;
				}
				if (count == K) break;
			}
		}
		System.out.println(sum);
	}
}
