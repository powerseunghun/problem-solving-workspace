package CodeUp.ThreeThousandth.Eight;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Zoo3806 {
	static long[] arr = null;
	static boolean[] check = null;
//	static long f(int N) {
//		if (N == 1) {
//			check[N] = true;
//			return arr[N] = 3;
//		}
//		else if (N == 2) {
//			check[N] = true;
//			return arr[N] = 7;
//		}
//		else {
//			check[N] = true;
//			return arr[N] = 2 * f(N-1) + f(N-2);
//		}
//	}
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		arr = new long[N+1];
		check = new boolean[N+1];
		Arrays.fill(arr, 0);
		Arrays.fill(check, false);
		
		arr[0] = 3; arr[1] = 7;
		for (int i = 2; i <= N; i++) {
			arr[i] = ((2 * arr[i-1]) + arr[i-2]) % 9901;
		}
		
		System.out.println(arr[N-1]);
	}
}
