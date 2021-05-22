package CodeUp.TwoThousandth.Six;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class UpStairs2632 {
	static int[] arr = null;
	static boolean[] check = null;
	static int stairs(int n) {
		if (check[n]) return arr[n];
		if (n == 1) {
			check[1] = true;
			arr[1] = 1;
			return arr[1] = 1;
		}
		else if (n == 2) {
			check[2] = true;
			return arr[2] = 2;
		}
		else {
			check[n] = true;
			return arr[n] = stairs(n-2) + stairs(n-1);
		}
	}
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		arr = new int[n+1];
		check = new boolean[n+1];
		Arrays.fill(arr, 0);
		Arrays.fill(check, false);
		
		System.out.println(stairs(n));
	}
}
