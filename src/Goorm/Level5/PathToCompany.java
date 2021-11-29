package Goorm.Level5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

class Info {
	private int from;
	private int to;
	private int path;
	
	public Info(int f, int t, int p) {
		this.from = f;
		this.to = t;
		this.path = p;
	}
	public int getFrom() {
		return from;
	}
	public void setFrom(int from) {
		this.from = from;
	}
	public int getTo() {
		return to;
	}
	public void setTo(int to) {
		this.to = to;
	}
	public int getPath() {
		return path;
	}
	public void setPath(int path) {
		this.path = path;
	}
}
public class PathToCompany {
	static int[][] arr = null;
	static boolean[] check = null;
	static int min = Integer.MAX_VALUE;
	static void bfs(int from) {
		Queue<Info> q = new LinkedList<>();
		
		check[from] = true;
		for (int i = 1; i < arr[from].length; i++) {
			if (arr[from][i] != 0) {
				q.add(new Info(from, i, arr[from][i]));
			}
		}
		while (!q.isEmpty()) {
			Info tmp = q.poll();
			
			if (tmp.getTo() == arr.length-1) {
				min = Math.min(min, tmp.getPath());
				continue;
			}
			check[tmp.getTo()] = true;
			for (int i = 1; i < arr[tmp.getTo()].length; i++) {
				if (arr[tmp.getTo()][i] != 0 && !check[i]) {
					q.add(new Info(tmp.getTo(), i, tmp.getPath() + arr[tmp.getTo()][i]));
				}
			}
		}
	}
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String tmp = br.readLine();
		int a = Integer.parseInt(tmp.split(" ")[0]);
		int b = Integer.parseInt(tmp.split(" ")[1]);
		arr = new int[a+1][a+1];
		check = new boolean[a+1];
		
		for (int i = 0, f = 0, t = 0, p = 0; i < b; i++) {
			tmp = br.readLine();
			f = Integer.parseInt(tmp.split(" ")[0]);
			t = Integer.parseInt(tmp.split(" ")[1]);
			p = Integer.parseInt(tmp.split(" ")[2]);
			arr[f][t] = arr[f][t] == 0 ? p : Math.min(arr[f][t], p);
			arr[t][f] = arr[t][f] == 0 ? p : Math.min(arr[t][f], p);
		}
		
		// vertex1 시작
		bfs(1);
		System.out.println(min);
		br.close();
	}
}
