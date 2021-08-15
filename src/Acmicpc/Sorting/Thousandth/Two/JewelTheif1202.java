package Acmicpc.Sorting.Thousandth.Two;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

class Jewel implements Comparable<Jewel>{
	private int m;
	private int v;
	
	public Jewel() {
		this.m = 0;
		this.v = 0;
	}
	public Jewel(int m, int v) {
		this.m = m;
		this.v = v;
	}
	public int getM() {
		return this.m;
	}
	public int getV() {
		return this.v;
	}
	@Override
	public int compareTo(Jewel o) {
		return this.getM() - o.getM();
	}
}
public class JewelTheif1202 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		PriorityQueue<Jewel> q = new PriorityQueue<>();
		StringTokenizer st = null;
		String tmp = br.readLine();
		int N = Integer.parseInt(tmp.split(" ")[0]);
		int K = Integer.parseInt(tmp.split(" ")[1]), sum = 0;
		int[] bag = new int[K];
		
		for (int i = 0; i < N; i++) {
			st = new StringTokenizer(br.readLine());
			q.add(new Jewel(Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken())));
		}
		
		for (int i = 0; i < K; i++) {
			bag[i] = Integer.parseInt(br.readLine());
		}
		Arrays.sort(bag);
		
		for (int i = 0; i < bag.length;) {
			if (bag[i] > q.peek().getM()) {
				sum += q.peek().getV();
				i++;
				q.poll();
			}
			else i++;
		}
		System.out.println(sum);
	}
}
