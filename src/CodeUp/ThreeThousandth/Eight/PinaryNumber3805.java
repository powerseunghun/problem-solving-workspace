package CodeUp.ThreeThousandth.Eight;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class PinaryNumber3805 {
	static long[] arr = null;
	static boolean[] check = null;
	static long f(int N) {
		if (check[N]) return arr[N];
		
		if (N <= 2) {
			check[N] = true;
			return arr[N] = 1;
		}
		else {
			check[N] = true;
			return arr[N] = f(N-2) + f(N-1);
		}
	}
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		arr = new long[N+1];
		check = new boolean[N+1];
		
		Arrays.fill(arr, 0);
		Arrays.fill(check, false);
		
		System.out.println(f(N));
	}
}
