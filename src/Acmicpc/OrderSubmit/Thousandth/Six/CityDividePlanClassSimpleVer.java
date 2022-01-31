package Acmicpc.OrderSubmit.Thousandth.Six;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.PriorityQueue;

class Info implements Comparable<Info> {
	private int n;
	private int w;
	
	public Info(int n, int c) {
		this.n = n;
		this.w = c;
	}
	public int getN() {
		return n;
	}
	public void setN(int n) {
		this.n = n;
	}
	public int getW() {
		return w;
	}
	public void setW(int w) {
		this.w = w;
	}
	@Override
	public int compareTo(Info o) {
		return this.getW() - o.getW();
	}
}
public class CityDividePlanClassSimpleVer {
	static ArrayList<ArrayList<Info>> list = new ArrayList<>();
	static boolean[] check = null;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		PriorityQueue<Info> q = new PriorityQueue<>();
		String tmp = br.readLine();
		int N = Integer.parseInt(tmp.split(" ")[0]);
		int M = Integer.parseInt(tmp.split(" ")[1]);
		int sum = 0, maxWeight = Integer.MIN_VALUE;
		
		check = new boolean[N+1];
		for (int i = 0; i <= N; i++) {
			list.add(new ArrayList<>());
		}
		
		for (int i = 0, A = 0, B = 0, C = 0; i < M; i++) {
			tmp = br.readLine();
			A = Integer.parseInt(tmp.split(" ")[0]);
			B = Integer.parseInt(tmp.split(" ")[1]);
			C = Integer.parseInt(tmp.split(" ")[2]);
			list.get(A).add(new Info(B, C));
			list.get(B).add(new Info(A, C));
		}
		
		q.add(new Info(1, 0));
		
		while (!q.isEmpty()) {
			Info tmpNode = q.poll();
			if (check[tmpNode.getN()]) continue;
			check[tmpNode.getN()] = true;
			
			maxWeight = Math.max(maxWeight, tmpNode.getW());
			sum += tmpNode.getW();
			
			for (int i = 0, next = 0, nextWeight = 0; i < list.get(tmpNode.getN()).size(); i++) {
				next = list.get(tmpNode.getN()).get(i).getN();
				nextWeight = list.get(tmpNode.getN()).get(i).getW();
				
				if (!check[next]) q.add(new Info(next, nextWeight));
			}
		}
		System.out.println(sum - maxWeight);
	}
}
