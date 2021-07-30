package Acmicpc.GraphTheory.Thousandth.Nine;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.PriorityQueue;

class Node2 implements Comparable<Node2>{
	private int to;
	private int cost;
	
	public Node2() {
		this.to = 0;
		this.cost = 0;
	}
	public Node2(int t, int c) {
		this.to = t;
		this.cost = c;
	}
	public int getTo() {
		return this.to;
	}
	public int getCost() {
		return this.cost;
	}
	@Override
	public int compareTo(Node2 o) {
		return this.cost - o.cost;
	}
}
public class CalcMinimalCost1916 {
	static boolean[] check = null;
	static int[] dist = null;
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		PriorityQueue<Node2> q = new PriorityQueue<>();
		String tmp = null;
		int N = Integer.parseInt(br.readLine());
		int M = Integer.parseInt(br.readLine());
		int A = 0, B = 0, C = 0;
		check = new boolean[N+1];
		dist = new int[N+1];
		Arrays.fill(dist, Integer.MAX_VALUE);
		ArrayList<ArrayList<Node2>> list = new ArrayList<>();
		for (int i = 0; i <= N; i++) {
			list.add(new ArrayList<>());
		}
		
		for (int i = 0; i < M; i++) {
			tmp = br.readLine();
			A = Integer.parseInt(tmp.split(" ")[0]);
			B = Integer.parseInt(tmp.split(" ")[1]);
			C = Integer.parseInt(tmp.split(" ")[2]);
			list.get(A).add(new Node2(B, C));
		}
		tmp = br.readLine();
		A = Integer.parseInt(tmp.split(" ")[0]);
		B = Integer.parseInt(tmp.split(" ")[1]);
		
		check[A] = true;
		dist[A] = 0;
		q.add(new Node2(A, 0));
		
		while (!q.isEmpty()) {
			Node2 t = q.poll();
			int to = t.getTo();
			if (dist[to] < t.getCost()) {
				continue;
			}
			
			for (int i = 0; i < list.get(to).size(); i++) {
				Node2 tNode = list.get(to).get(i);
				
				if (dist[tNode.getTo()] > (t.getCost() + tNode.getCost())) {
					dist[tNode.getTo()] = t.getCost() + tNode.getCost();
					q.add(new Node2(tNode.getTo(), dist[tNode.getTo()]));
				}
			}
		}
		System.out.println(dist[B]);
		
	}
}
