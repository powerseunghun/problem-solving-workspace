package Acmicpc.Step25;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.PriorityQueue;

class Vertex implements Comparable<Vertex>{
	private int to;
	private int weight;
	
	public Vertex() {
		this.to = 0;
		this.weight = 0;
	}
	
	public Vertex(int t, int w) {
		this.to = t;
		this.weight = w;
	}
	public int getTo() {
		return this.to;
	}
	public int getWeight() {
		return this.weight;
	}

	@Override
	public int compareTo(Vertex o) {
		return this.weight-o.weight;
	}
}
public class ShortestPathDijkstra1753 {
	static List<Vertex>[] list;
	static boolean[] check = null;
	static int[] dist = null;
	static void func(int start) {
		PriorityQueue<Vertex> q = new PriorityQueue<>();
		dist[start] = 0;
		q.add(new Vertex(start, 0));
		
		while(!q.isEmpty()) {
			Vertex tmp = q.poll();
			if (check[tmp.getTo()]) continue;
			check[tmp.getTo()] = true;
			
			for (int i = 0; i < list[tmp.getTo()].size(); i++) {
				Vertex v = list[tmp.getTo()].get(i);
				if (dist[v.getTo()] > dist[tmp.getTo()] + v.getWeight()) {
					dist[v.getTo()] = dist[tmp.getTo()] + v.getWeight();
					q.add(new Vertex(v.getTo(), dist[v.getTo()]));
				}
			}
		}
	}
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String tmp = br.readLine();
		int V = Integer.parseInt(tmp.split(" ")[0]), E = Integer.parseInt(tmp.split(" ")[1]);
		int start = Integer.parseInt(br.readLine());
		int u = 0, v = 0, w = 0;
		list = new ArrayList[V+1];
		for (int i = 0; i < list.length; i++) {
			list[i] = new ArrayList<Vertex>();
		}
		dist = new int[V+1];
		Arrays.fill(dist, Integer.MAX_VALUE);
		check = new boolean[V+1];
		
		for (int i = 0; i < E; i++) {
			tmp = br.readLine();
			u = Integer.parseInt(tmp.split(" ")[0]);
			v = Integer.parseInt(tmp.split(" ")[1]);
			w = Integer.parseInt(tmp.split(" ")[2]);
			
			list[u].add(new Vertex(v, w));
		}
		func(start);
		
		for (int i = 1; i < dist.length; i++) {
			if (dist[i] == Integer.MAX_VALUE) {
				System.out.println("INF");
			}
			else System.out.println(dist[i]);
		}
	}
}
