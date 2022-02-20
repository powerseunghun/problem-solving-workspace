package Acmicpc.OrderSubmit.Thousandth.Zero;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

class Info {
	private String str;
	private int n;
	
	public Info(String s, int n) {
		this.str = s;
		this.n = n;
	}

	public String getStr() {
		return str;
	}

	public void setStr(String str) {
		this.str = str;
	}

	public int getN() {
		return n;
	}

	public void setN(int n) {
		this.n = n;
	}
}
public class Exchange1039 {
	static boolean[][] check = null;
	static int max = -1;
	static int getNext(String str, int i, int j) {
		char[] cArr = str.toCharArray();
		
		if (cArr[j] == '0' && i == 0) return -1;
		
		char tmp = cArr[i];
		cArr[i] = cArr[j];
		cArr[j] = tmp;
		
		return Integer.parseInt(String.valueOf(cArr));
	}
	static void bfs(String n, int k) {
		Queue<Info> q = new LinkedList<>();
		q.add(new Info(n, 0));
		
		while (!q.isEmpty()) {
			Info tmp = q.poll();
			
			if (tmp.getN() == k) {
				max = Math.max(max, Integer.parseInt(tmp.getStr()));
				continue;
			}
			
			for (int i = 0; i < tmp.getStr().length()-1; i++) {
				for (int j = i+1, next = 0; j < tmp.getStr().length(); j++) {
					next = getNext(tmp.getStr(), i, j);
					if (next != -1 && !check[next][tmp.getN()+1]) {
						check[next][tmp.getN()+1] = true;
						q.add(new Info(next+"", tmp.getN()+1));
					}
				}
			}
		}
	}
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String tmp = br.readLine();
		String N = tmp.split(" ")[0];
		int K = Integer.parseInt(tmp.split(" ")[1]);
		
		check = new boolean[1000001][11];
		bfs(N, K);
		System.out.println(max);
	}
}
