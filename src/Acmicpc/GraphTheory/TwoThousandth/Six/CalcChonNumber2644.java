package Acmicpc.GraphTheory.TwoThousandth.Six;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

class Node {
	private int vertex;
	private int to;
	private int count;
	
	public Node() {
		this.vertex = 0;
		this.to = 0;
		this.count = 0;
	}
	public Node(int v, int t, int c) {
		this.vertex = v;
		this.to = t;
		this.count = c;
	}
	public int getVertex() {
		return this.vertex;
	}
	public int getTo() {
		return this.to;
	}
	public void setCount(int c) {
		this.count = c;
	}
	public int getCount() {
		return this.count;
	}
}
public class CalcChonNumber2644 {
	static int ans = -1;
	static ArrayList<ArrayList<Node>> list = new ArrayList<>();
	static boolean[] check = null;
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine()), m = 0, x = 0, y = 0;
		check = new boolean[n+1];
		Queue<Node> q = new LinkedList<>();
		String tmp = br.readLine();
		int A = Integer.parseInt(tmp.split(" ")[0]);
		int B = Integer.parseInt(tmp.split(" ")[1]);
		
		for (int i = 0; i < n+1; i++) {
			list.add(new ArrayList<>());
		}
		
		m = Integer.parseInt(br.readLine());
		for (int i = 0; i < m; i++) {
			tmp = br.readLine();
			x = Integer.parseInt(tmp.split(" ")[0]);
			y = Integer.parseInt(tmp.split(" ")[1]);
			list.get(x).add(new Node(x, y, 0));
			list.get(y).add(new Node(y, x, 0));
		}
		
		// 시작 정점 A
		check[A] = true;
		for (int i = 0; i < list.get(A).size(); i++) {
			Node tNode = list.get(A).get(i);
			tNode.setCount(1);
			q.add(tNode);
		}
		
		while(!q.isEmpty()) {
			Node t = q.poll();
			int to = t.getTo();
			check[t.getVertex()] = true;
			if (to == B) {
				ans = t.getCount();
				break;
			}
			
			for (int i = 0; i < list.get(to).size(); i++) {
				Node tNode = list.get(to).get(i);
				tNode.setCount(t.getCount()+1);
				if (!check[tNode.getTo()]) q.add(tNode);
			}
		}
		System.out.println(ans);
	}
}
