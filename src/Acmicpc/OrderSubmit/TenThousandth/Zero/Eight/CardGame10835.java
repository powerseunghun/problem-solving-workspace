package Acmicpc.OrderSubmit.TenThousandth.Zero.Eight;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class CardGame10835 {
	static int[] l = null, r = null;
	static int[][] mem = null;
	static void init(int N) {
		l = new int[N];
		r = new int[N];
		mem = new int[N][N];
		
		for (int i = 0; i < mem.length; i++) {
			Arrays.fill(mem[i], -1);
		}
	}
	static int func(int idx1, int idx2, int N) {
		if (idx1 == N || idx2 == N) return 0;
		
		if (mem[idx1][idx2] != -1) return mem[idx1][idx2];
		mem[idx1][idx2] = 0;
		
		int res1 = func(idx1+1, idx2, N);
		int res2 = func(idx1+1, idx2+1, N);
		int res3 = l[idx1] > r[idx2] ? r[idx2] + func(idx1, idx2+1, N) : 0;
		
		return mem[idx1][idx2] = Math.max(res1, Math.max(res2, res3));
	}
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = null;
		int N = Integer.parseInt(br.readLine());
		
		init(N);
		for (int i = 0; i < 2; i++) {
			st = new StringTokenizer(br.readLine());
			if (i == 0) {
				for (int j = 0; j < l.length; j++) {
					l[j] = Integer.parseInt(st.nextToken());
				}
			}
			else {
				for (int j = 0; j < r.length; j++) {
					r[j] = Integer.parseInt(st.nextToken());
				}
			}
		}
		
		System.out.println(func(0, 0, N));
		br.close();
//		for (int el : l) {
//			System.out.print(el + " ");
//		}
//		System.out.println();
//		for (int el : r) {
//			System.out.print(el + " ");
//		}
//		System.out.println();
	}
}
