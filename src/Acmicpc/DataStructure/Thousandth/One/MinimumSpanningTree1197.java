package Acmicpc.DataStructure.Thousandth.One;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.PriorityQueue;

class Node implements Comparable<Node> {
	private int v;
	private int to;
	private int w;
	
	public Node() {
		this.v = 0;
		this.to = 0;
		this.w = 0;
	}
	public Node(int v, int t, int w) {
		this.v = v;
		this.to = t;
		this.w = w;
	}
	public int getV() {
		return this.v;
	}
	public void setV(int v) {
		this.v = v;
	}
	public int getTo() {
		return this.to;
	}
	public void setTo(int t) {
		this.to = t;
	}
	public int getW() {
		return this.w;
	}
	public void setW(int w) {
		this.w = w;
	}
	@Override
	public int compareTo(Node o) {
		return this.getW() - o.getW();
	}
}
public class MinimumSpanningTree1197 {
	static boolean[] check = null;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String tmp = br.readLine();
		PriorityQueue<Node> q = new PriorityQueue<>();
		ArrayList<ArrayList<Node>> list = new ArrayList<>();
		int V = Integer.parseInt(tmp.split(" ")[0]);
		int E = Integer.parseInt(tmp.split(" ")[1]);
		int A = 0, B = 0, C = 0, sum = 0;
		for (int i = 0; i < V+1; i++) {
			list.add(new ArrayList<>());
		}
		check = new boolean[V+1];
		
		for (int i = 0; i < E; i++) {
			tmp = br.readLine();
			A = Integer.parseInt(tmp.split(" ")[0]);
			B = Integer.parseInt(tmp.split(" ")[1]);
			C = Integer.parseInt(tmp.split(" ")[2]);
			list.get(A).add(new Node(A, B, C));
			list.get(B).add(new Node(B, A, C));
		}
		
		for (int i = 0, next = 0, nextWeight = 0; i < list.get(1).size(); i++) {
			next = list.get(1).get(i).getTo();
			nextWeight = list.get(1).get(i).getW();
			
			q.add(new Node(1, next, nextWeight));
		}
		check[1] = true;
		
		while (!q.isEmpty()) {
			Node tNode = q.poll();
			if (check[tNode.getTo()]) continue;
			check[tNode.getTo()] = true;
			
			sum += tNode.getW();
			
			for (int i = 0, next = 0, nextWeight = 0; i < list.get(tNode.getTo()).size(); i++) {
				next = list.get(tNode.getTo()).get(i).getTo();
				nextWeight = list.get(tNode.getTo()).get(i).getW();
				
				q.add(new Node(tNode.getTo(), next, nextWeight));
			}
		}
		System.out.println(sum);
	}
}
