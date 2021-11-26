package Goorm.Level5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class PrimeCycle {
	static int[] arr = null;
	static boolean[] check = null;
	static int[] prime = new int[40];
	static List<int[]> list = new ArrayList<>();
	static void bt(int n, int d) {
		if (d >= n) {
			//last check end,first
			if (prime[arr[0]+arr[n-1]] != 0) {
				list.add(arr.clone());
			}
			return;
		}
		
		for (int i = 1; i <= n; i++) {
			if (prime[arr[d-1] + i] != 0 && !check[i]) {
				arr[d] = i;
				check[i] = true;
				bt(n, d+1);
				check[i] = false;
			}
		}
	}
	static void primeArrInit() {
		for (int i = 2; i < prime.length; i++) {
			prime[i] = i;
		}
		for (int i = 2; i < prime.length; i++) {
			if (prime[i] == 0) continue;
			for (int j = i*2; j < prime.length; j+=i) {
				prime[j] = 0;
			}
		}
	}
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int N = Integer.parseInt(br.readLine());
		arr = new int[N];
		check = new boolean[N+1];
		arr[0] = 1;
		check[1] = true;
		
		primeArrInit();
		bt(N, 1);
		for (int i = 0; i < list.size(); i++) {
			arr = list.get(i);
			for (int j = 0; j < arr.length; j++) {
				sb.append(arr[j]);
				if (j != arr.length-1) sb.append(" ");
			}
			if (i != list.size()-1) sb.append("\n");
		}
		System.out.print(sb.toString());
		br.close();
	}
}
