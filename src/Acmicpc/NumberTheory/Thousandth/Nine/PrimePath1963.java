package Acmicpc.NumberTheory.Thousandth.Nine;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class PrimePath1963 {
	static int[] div = {1000, 100, 10, 1};
	static int[] prime = new int[10000];
	static void primeInit() {
		for (int i = 2; i < prime.length; i++) {
			prime[i] = i;
		}
		for (int i = 2; i < prime.length; i++) {
			if (prime[i] == 0) continue;
			for (int j = 2 * i; j < prime.length; j+=i) {
				prime[j] = 0;
			}
		}
	}
	static int bfs(int A, int B) {
		boolean[] check = new boolean[10000];
		int count = -1, s = 0, next = 0;
		Queue<Integer> q = new LinkedList<>();
		check[A] = true;
		q.add(A);
		
		while (!q.isEmpty()) {
			count++;
			s = q.size();
			for (int i = 0; i < s; i++) {
				int tmp = q.poll();
				if (tmp == B) return count;
				
				int[] digit = new int[4];
				for (int j = 0; j < digit.length; j++) {
					digit[j] = tmp / div[j];
					tmp %= div[j];
				}
				
				for (int j = 0; j < 4; j++) {
					for (int k = 0; k < 10; k++) {
						digit[j] = digit[j]+1 >= 10 ? 0 : digit[j]+1;
						next = 0;
						for (int l = 0; l < 4; l++) {
							next += digit[l] * div[l];
						}
						if (next < 1000) continue;
						if (check[next]) continue;
						if (prime[next] == 0) continue;
						q.add(next);
						check[next] = true;
					}
				}
			}
		}
		return -1;
	}
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		String tmp = null;
		
		primeInit();
		int T = Integer.parseInt(br.readLine()), a = 0, b = 0, cn = 0;
		for (int i = 0; i < T; i++) {
			tmp = br.readLine();
			a = Integer.parseInt(tmp.split(" ")[0]);
			b = Integer.parseInt(tmp.split(" ")[1]);
			if (a == b) {
				sb.append("0\n");
				continue;
			}
			cn = bfs(a, b);
			sb.append(cn + "\n");
 		}
		System.out.print(sb.toString());
	}
}
