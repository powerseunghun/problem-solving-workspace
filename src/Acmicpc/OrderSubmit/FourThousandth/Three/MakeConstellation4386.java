package Acmicpc.OrderSubmit.FourThousandth.Three;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class MakeConstellation4386 {
	static class Info {
		private int v;
		private double x;
		private double y;
		
		public Info(int v, double x, double y) {
			this.v = v;
			this.x = x;
			this.y = y;
		}
		public int getV() {
			return v;
		}
		public void setV(int v) {
			this.v = v;
		}
		public double getX() {
			return x;
		}
		public void setX(double x) {
			this.x = x;
		}
		public double getY() {
			return y;
		}
		public void setY(double y) {
			this.y = y;
		}
	}
	static class Edge {
		private int s;
		private int e;
		private double w;
		
		public Edge(int s, int e, double w) {
			this.s = s;
			this.e = e;
			this.w = w;
		}
		public int getS() {
			return s;
		}
		public void setS(int s) {
			this.s = s;
		}
		public int getE() {
			return e;
		}
		public void setE(int e) {
			this.e = e;
		}
		public double getW() {
			return w;
		}
		public void setW(double w) {
			this.w = w;
		}
	}
	static Info[] infoArr = null;
	static List<Edge> list = new ArrayList<>();
	static int[] check = null;
	static void union(int x, int y) {
		x = find(x);
		y = find(y);
		if (x != y) {
			check[y] = x;
		}
	}
	static int find(int v) {
		if (v == check[v]) return v;
		return check[v] = find(check[v]);
	}
	static double getDist(Info x, Info y) {
		double tmp1 = Math.pow(x.getX()-y.getX(), 2);
		double tmp2 = Math.pow(x.getY()-y.getY(), 2);
		return Math.sqrt(tmp1+tmp2);
	}
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		double x = 0, y = 0, res = 0;
		String tmp = null;
		infoArr = new Info[N];
		check = new int[N+1];
		
		for (int i = 1; i < check.length; i++) {
			check[i] = i;
		}
		for (int i = 0; i < N; i++) {
			tmp = br.readLine();
			x = Double.parseDouble(tmp.split(" ")[0]);
			y = Double.parseDouble(tmp.split(" ")[1]);
			infoArr[i] = new Info(i+1, x, y);
		}
		for (int i = 0; i < infoArr.length; i++) {
			for (int j = i+1; j < infoArr.length; j++) {
				list.add(new Edge(infoArr[i].getV(), infoArr[j].getV(), getDist(infoArr[i], infoArr[j])));
			}
		}
		Collections.sort(list, new Comparator<Edge>() {
			@Override
			public int compare(Edge o1, Edge o2) {
				return (int)(o1.getW()-o2.getW());
			}
		});
//		for (int i = 0; i < list.size(); i++) {
//			System.out.println(list.get(i).getS() + ", " + list.get(i).getE() + ", " + list.get(i).getW());
//		}
		for (int i = 0; i < list.size(); i++) {
			Edge tmpEdge = list.get(i);
			if (find(tmpEdge.getS()) != find(tmpEdge.getE())) {
				res += tmpEdge.getW();
				union(tmpEdge.getS(), tmpEdge.getE());
			}
		}
		
		System.out.printf("%.2f\n", res);
		br.close();
	}
}
