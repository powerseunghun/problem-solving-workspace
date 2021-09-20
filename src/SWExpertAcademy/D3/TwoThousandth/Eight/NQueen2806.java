package SWExpertAcademy.D3.TwoThousandth.Eight;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class NQueen2806 {
	static int[] arr = null;
	static int count = 0;
	static boolean check(int l) {
		for (int i = 0; i < l; i++) {
			if (arr[i] == arr[l]) {
				return false;
			}
			if (Math.abs(l - i) == Math.abs(arr[l] - arr[i])) {
				return false;
			}
		}
		return true;
	}
	static void bt(int n, int d) {
		if (d >= n) {
			count++;
			return;
		}
		
		for (int i = 0; i < n; i++) {
			arr[d] = i;
			
			if (check(d)) {
				bt(n, d+1);
			}
		}
	}
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int T = Integer.parseInt(br.readLine()), N = 0;
		
		for (int i = 1; i <= T; i++) {
			N = Integer.parseInt(br.readLine());
			count = 0;
			arr = new int[N];
			bt(N, 0);
			sb.append("#" + i + " " + count + "\n");
		}
		System.out.print(sb.toString());
	}
}
