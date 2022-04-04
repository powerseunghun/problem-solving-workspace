package Acmicpc.OrderSubmit.SixThousandth.Four;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class EletricEnergyCrisis6497 {
	static int[] check = null;
	static List<Node> list = null;
	static int total = 0, k = 0;
	static void init(int m) {
		check = new int[m];
		for (int i = 0; i < check.length; i++) {
			check[i] = i;
		}
		list = new ArrayList<>();
		total = 0;
		k = 0;
	}
	static int find(int x) {
		if (x == check[x]) return x;
		return check[x] = find(check[x]);
	}
	static void union(int x, int y) {
		x = find(x);
		y = find(y);
		if (x != y) check[y] = x;
	}
	static class Node implements Comparable<Node>{
		private int f;
		private int t;
		private int w;
		
		public Node(int f, int t, int w) {
			this.f = f;
			this.t = t;
			this.w = w;
		}
		public int getF() {
			return f;
		}
		public void setF(int f) {
			this.f = f;
		}
		public int getT() {
			return t;
		}
		public void setT(int t) {
			this.t = t;
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
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int m = 0, n = 0;
		String tmp = null;
		
		while (true) {
			tmp = br.readLine();
			m = Integer.parseInt(tmp.split(" ")[0]);
			n = Integer.parseInt(tmp.split(" ")[1]);
			if (m == 0 && n == 0) break;
			init(m);
			
			for (int i = 0, f = 0, t = 0, w = 0; i < n; i++) {
				tmp = br.readLine();
				f = Integer.parseInt(tmp.split(" ")[0]);
				t = Integer.parseInt(tmp.split(" ")[1]);
				w = Integer.parseInt(tmp.split(" ")[2]);
				list.add(new Node(f,t,w));
				total += w;
			}
			Collections.sort(list);
			
			for (int i = 0; i < list.size(); i++) {
				Node tNode = list.get(i);
				if (find(tNode.getF()) != find(tNode.getT())) {
					k += tNode.getW();
					union(tNode.getF(), tNode.getT());
				}
			}
			sb.append((total-k) + "\n");
		}
		System.out.print(sb.toString());
		br.close();
	}
}
