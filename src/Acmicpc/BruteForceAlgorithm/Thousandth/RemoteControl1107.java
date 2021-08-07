package Acmicpc.BruteForceAlgorithm.Thousandth;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class RemoteControl1107 {
	static int min = Integer.MAX_VALUE;
	static int[] arr = new int[7];
	static boolean[] check = new boolean[10];
	static int getCount(int n) {
		int cnt = 0;
		if (n == 0) {
			if (check[0]) return 0;
			else return 1;
		}
		while (n != 0) {
			if (check[n%10]) return 0;
			n /= 10;
			cnt++;
		}
		return cnt;
	}
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int M = Integer.parseInt(br.readLine());
		
		if (M != 0) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			for (int i = 0; i < M; i++) {
				check[Integer.parseInt(st.nextToken())] = true;
			}
		}
		
		if (N == 100) {
			System.out.println("0");
			return;
		}
		
		min = Math.abs(N - 100);
		for (int i = 0; i <= 1000000; i++) {
			if (getCount(i) > 0) {
				min = Math.min(min, Math.abs(N-i) + getCount(i));
			}
		}
		System.out.println(min);
	}
}
