package CodeUp.TwoThousandth.Six;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class MakeBinaryConditionLarge2654 {
	static int[] arr = null;
	static boolean[] check = null;
	static int binaryDP(int n) {
		if (n == 1) {
			check[n] = true;
			return arr[n] = 2 % 1000000007;
		}
		else if (n == 2) {
			check[n] = true;
			return arr[n] = 3 % 1000000007;
		}
		if (check[n]) return arr[n];
		else {
			check[n] = true;
			return arr[n] = (binaryDP(n-2) + binaryDP(n-1)) % 1000000007;
		}
	}
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		arr = new int[n+1];
		check = new boolean[n+1];
		Arrays.fill(arr, 0);
		Arrays.fill(check, false);
		
		System.out.println(binaryDP(n));
	}
}
