package CodeUp.YunSoo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Fibo {
	static long[] arr = null;
	static boolean[] check = null;
	static long fibo(int n) {
//		if (n <= 1) return 1;
//		else return fibo(n-1) + fibo(n-2);
		if (check[n]) return arr[n];
		
		if (n <= 1) {
			check[n] = true;
			return arr[n] = 1;
		}
		else {
			check[n] = true;
			return arr[n] = fibo(n-1) + fibo(n-2);
		}
	}
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		
		arr = new long[n+1];
		check = new boolean[n+1];
		
		System.out.println(fibo(n));
	}
}
