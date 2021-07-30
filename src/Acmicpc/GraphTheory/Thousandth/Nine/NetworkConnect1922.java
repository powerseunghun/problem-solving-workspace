package Acmicpc.GraphTheory.Thousandth.Nine;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.PriorityQueue;

class Node implements Comparable<Node>{
	private int to;
	private int cost;
	
	public Node() {
		this.to = 0;
		this.cost = 0;
	}
	
	public Node(int t, int c) {
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
	public int compareTo(Node o) {
		return this.cost-o.cost;
	}
}
public class NetworkConnect1922 {
	static int price = 0;
	static boolean[] check = null;
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String tmp = null;
		int N = Integer.parseInt(br.readLine());
		int M = Integer.parseInt(br.readLine());
		int a = 0, b = 0, c = 0;
		check = new boolean[N+1];
		ArrayList<ArrayList<Node>> list = new ArrayList<>();
		PriorityQueue<Node> q = new PriorityQueue<>();
		
		for (int i = 0; i <= N; i++) {
			list.add(new ArrayList<Node>());
		}
		
		for (int i = 0; i < M; i++) {
			tmp = br.readLine();
			a = Integer.parseInt(tmp.split(" ")[0]);
			b = Integer.parseInt(tmp.split(" ")[1]);
			c = Integer.parseInt(tmp.split(" ")[2]);
			list.get(a).add(new Node(b, c));
			list.get(b).add(new Node(a, c));
		}
		
		check[1] = true;
		for (int i = 0; i < list.get(1).size(); i++) {
			q.add(list.get(1).get(i));
		}
		
		while(!q.isEmpty()) {
			Node t = q.poll();
			int to = t.getTo();
			if (check[to]) continue;
			check[to] = true;
			price += t.getCost();
			
			for (int i = 0; i < list.get(to).size(); i++) {
				Node tNode = list.get(to).get(i);
				if (!check[tNode.getTo()]) {
					q.add(tNode);
				}
			}
		}
		System.out.println(price);
	}
}
