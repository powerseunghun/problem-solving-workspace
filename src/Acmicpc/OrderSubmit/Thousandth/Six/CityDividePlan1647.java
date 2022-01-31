package Acmicpc.OrderSubmit.Thousandth.Six;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.PriorityQueue;

class Node implements Comparable<Node>{
	private int v;
	private int to;
	private int w;
	
	public Node(int v, int t, int w) {
		this.v = v;
		this.to = t;
		this.w = w;
	}
	public int getV() {
		return v;
	}
	public void setV(int v) {
		this.v = v;
	}
	public int getTo() {
		return to;
	}
	public void setTo(int to) {
		this.to = to;
	}
	public int getW() {
		return w;
	}
	public void setW(int w) {
		this.w = w;
	}
	@Override
	public int compareTo(Node o) {
		return this.getW() - o.getW();
	}
}
public class CityDividePlan1647 {
	static ArrayList<ArrayList<Node>> list = new ArrayList<>();
	static boolean[] check = null;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		PriorityQueue<Node> q = new PriorityQueue<>();
		String tmp = br.readLine();
		int N = Integer.parseInt(tmp.split(" ")[0]);
		int M = Integer.parseInt(tmp.split(" ")[1]);
		int next = 0, nextWeight = 0, minPath = 0, maxWeight = 0;
		
		check = new boolean[N+1];
		for (int i = 0; i <= N; i++) {
			if (list.add(new ArrayList<>()));
		}
		
		for (int i = 0, A = 0, B = 0, C = 0; i < M; i++) {
			tmp = br.readLine();
			A = Integer.parseInt(tmp.split(" ")[0]);
			B = Integer.parseInt(tmp.split(" ")[1]);
			C = Integer.parseInt(tmp.split(" ")[2]);
			list.get(A).add(new Node(A, B, C));
			list.get(B).add(new Node(B, A, C));
		}
		
		q.add(new Node(0, 1, 0));
		while(!q.isEmpty()) {
			Node tmpNode = q.poll();
			if (check[tmpNode.getTo()]) continue;
			check[tmpNode.getTo()] = true;
			minPath += tmpNode.getW();
			maxWeight = Math.max(maxWeight, tmpNode.getW());
			
			for (int i = 0; i < list.get(tmpNode.getTo()).size(); i++) {
				next = list.get(tmpNode.getTo()).get(i).getTo();
				nextWeight = list.get(tmpNode.getTo()).get(i).getW();
				
				if (!check[next]) {
					q.add(new Node(tmpNode.getTo(), next, nextWeight));
				}
			}
		}
		System.out.println(minPath-maxWeight);
		br.close();
//		System.out.println("END");
	}
}
