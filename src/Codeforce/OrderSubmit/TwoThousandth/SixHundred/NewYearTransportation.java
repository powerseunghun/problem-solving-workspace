package Codeforce.OrderSubmit.TwoThousandth.SixHundred;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class NewYearTransportation {
	static int[] arr = null;
	static boolean[] check = null;
	static int n = 0, m = 0;
	static void bfs() {
		int nx = 0, tmp = 0;
		Queue<Integer> q = new LinkedList<>();
		q.add(1);
		check[1] = true;
		
		while (!q.isEmpty()) {
			tmp = q.poll();
			
			if (tmp == m) {
				System.out.println("YES");
				return;
			}
			nx = tmp + arr[tmp];
			if (nx < 1 || nx > n) continue;
			if (!check[nx]) {
				check[nx] = true;
				q.add(nx);
			}
		}
		System.out.println("NO");
		return;
	}
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String tmp = br.readLine();
		n = Integer.parseInt(tmp.split(" ")[0]);
		m = Integer.parseInt(tmp.split(" ")[1]);
		StringTokenizer st = new StringTokenizer(br.readLine());
		arr = new int[n+1];
		check = new boolean[n+1];
		
		for (int i = 1; i < arr.length-1; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		bfs();
		br.close();
	}
}
