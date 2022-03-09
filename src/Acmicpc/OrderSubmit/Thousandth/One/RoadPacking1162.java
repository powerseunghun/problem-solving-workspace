package Acmicpc.OrderSubmit.Thousandth.One;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.PriorityQueue;

class Node implements Comparable<Node>{
	private int V;
	private long W;
	private int T;
	
	public Node(int V, long W, int T) {
		this.V = V;
		this.W = W;
		this.T = T;
	}
	public int getV() {
		return V;
	}
	public void setV(int v) {
		V = v;
	}
	public long getW() {
		return W;
	}
	public void setW(long w) {
		W = w;
	}
	public int getT() {
		return T;
	}
	public void setT(int t) {
		T = t;
	}
	@Override
	public int compareTo(Node o) {
		return (int)(this.getW() - o.getW());
	}
}

public class RoadPacking1162 {
	static long[][] arr = null;
	static List<Node>[] list = null;
	static long res = Long.MAX_VALUE;
	static void init(int N, int K) {
		arr = new long[N+1][K+1];
		list = new ArrayList[N+1];
		
		for (int i = 1; i < arr.length; i++) {
			list[i] = new ArrayList<Node>();
			Arrays.fill(arr[i], Long.MAX_VALUE);
		}
	}
	static void dijkstra(int N, int K) {
		PriorityQueue<Node> pq = new PriorityQueue<>();
		pq.add(new Node(1, 0, 0));
		arr[1][0] = 0;
		
		while (!pq.isEmpty()) {
			Node tmp = pq.poll();
			if (tmp.getW() > arr[tmp.getV()][tmp.getT()]) continue;
			for (Node next : list[tmp.getV()]) {
				if (next.getW() + tmp.getW() < arr[next.getV()][tmp.getT()]) {
					arr[next.getV()][tmp.getT()] = next.getW() + tmp.getW();
					pq.add(new Node(next.getV(), next.getW()+tmp.getW(), tmp.getT()));
				}
				if (tmp.getT() < K && tmp.getW() < arr[next.getV()][tmp.getT()+1]) {
					arr[next.getV()][tmp.getT()+1] = tmp.getW();
					pq.add(new Node(next.getV(), tmp.getW(), tmp.getT()+1));
				}
			}
		}
		
		for (int i = 0; i <= K; i++) {
			res = Math.min(arr[N][i], res);
		}
	}
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String tmp = br.readLine();
		int N = Integer.parseInt(tmp.split(" ")[0]);
		int M = Integer.parseInt(tmp.split(" ")[1]);
		int K = Integer.parseInt(tmp.split(" ")[2]);
		
		init(N, K);
		for (int i = 0, f = 0, t = 0, w = 0; i < M; i++) {
			tmp = br.readLine();
			f = Integer.parseInt(tmp.split(" ")[0]);
			t = Integer.parseInt(tmp.split(" ")[1]);
			w = Integer.parseInt(tmp.split(" ")[2]);
			list[f].add(new Node(t, w, 0));
			list[t].add(new Node(f, w, 0));
		}
		dijkstra(N, K);
		
		System.out.println(res);
		br.close();
	}
}
