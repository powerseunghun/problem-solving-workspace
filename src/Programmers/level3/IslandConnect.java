package Programmers.level3;

import java.util.ArrayList;
import java.util.PriorityQueue;

class Node implements Comparable<Node> {
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
public class IslandConnect {
	static boolean[] check = null;
	static void init(int n, ArrayList<ArrayList<Node>> list, int[][] costs) {
		check = new boolean[n];
		for (int i = 0; i < n; i++) {
			list.add(new ArrayList<>());
		}
		
		for (int i = 0, a = 0, b = 0, w = 0; i < costs.length; i++) {
        	a = costs[i][0];
        	b = costs[i][1];
        	w = costs[i][2];
        	list.get(a).add(new Node(a, b, w));
        	list.get(b).add(new Node(b, a, w));
        }
	}
	static int func(int[][] costs, ArrayList<ArrayList<Node>> list) {
		PriorityQueue<Node> pq = new PriorityQueue<>();
		int sum = 0;
		
		for (int i = 0, next = 0, nextWeight = 0; i < list.get(0).size(); i++) {
			next = list.get(0).get(i).getTo();
			nextWeight = list.get(0).get(i).getW();
			
			pq.add(new Node(0, next, nextWeight));
		}
		check[0] = true;
		
		while (!pq.isEmpty()) {
			Node tmp = pq.poll();
			if (check[tmp.getTo()]) continue;
			check[tmp.getTo()] = true;
			
			sum += tmp.getW();
			
			for (int i = 0, next = 0, nextWeight = 0; i < list.get(tmp.getTo()).size(); i++) {
				next = list.get(tmp.getTo()).get(i).getTo();
				nextWeight = list.get(tmp.getTo()).get(i).getW();
				
				pq.add(new Node(tmp.getTo(), next, nextWeight));
			}
		}
		
		return sum;
	}
	static int solution(int n, int[][] costs) {
        ArrayList<ArrayList<Node>> list = new ArrayList<>();
        init(n, list, costs);
        
        return func(costs, list);
    }
	public static void main(String[] args) {
		int n = 4;
		int[][] costs = {{0,1,1},{0,2,2},{1,2,5},{1,3,1},{2,3,8}};
		
		System.out.println("END");
	}
}
