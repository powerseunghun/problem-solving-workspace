package Acmicpc.OrderSubmit.TenThousandth.One.Four;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Node {
	int v;
	Node link;
	
	Node(int v, Node l) {
		this.v = v;
		this.link = l;
	}

	public int getV() {
		return v;
	}

	public void setV(int v) {
		this.v = v;
	}

	public Node getLink() {
		return link;
	}

	public void setLink(Node link) {
		this.link = link;
	}
}
public class LCA11437 {
	static int[] p = null, d = null;
	static boolean[] check = null;
	static Node[] g = null;
	static void arrInit(int N) {
		p = new int[N+1];
		d = new int[N+1];
		check = new boolean[N+1];
		g = new Node[N+1];
	}
	static void dfs(int v, int depth) {
		check[v] = true;
		d[v] = depth;
		
		Node tmp = g[v];
		while (tmp != null) {
			if (!check[tmp.getV()]) {
				p[tmp.getV()] = v;
				dfs(tmp.getV(), depth+1);
			}
			tmp = tmp.getLink();
		}
	}
	static int LCA(int a, int b) {
		while (d[a] != d[b]) {
			if (d[a] > d[b]) {
				a = p[a];
			}
			else b = p[b];
		}
		while (a != b) {
			a = p[a];
			b = p[b];
		}
		return a;
	}
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		String tmp = null;
		
		int N = Integer.parseInt(br.readLine()), M = 0;
		arrInit(N);
		for (int i = 0, a = 0, b = 0; i < N-1; i++) {
			tmp = br.readLine();
			a = Integer.parseInt(tmp.split(" ")[0]);
			b = Integer.parseInt(tmp.split(" ")[1]);
			g[a] = new Node(b, g[a]);
			g[b] = new Node(a, g[b]);
		}
		
		M = Integer.parseInt(br.readLine());
		
		dfs(1, 0);
		for (int i = 0, a = 0, b = 0; i < M; i++) {
			tmp = br.readLine();
			a = Integer.parseInt(tmp.split(" ")[0]);
			b = Integer.parseInt(tmp.split(" ")[1]);
			sb.append(LCA(a, b)+"\n");
		}
		
		System.out.print(sb.toString());
		br.close();
	}
}
