package Acmicpc.OrderSubmit.TenThousandth.Zero.Eight;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class Fibonacci10826 {
	static BigInteger[] arr = new BigInteger[10001];
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		arr[0] = BigInteger.ZERO;
		arr[1] = BigInteger.ONE;
		
		for (int i = 2; i < arr.length; i++) {
			arr[i] = arr[i-2].add(arr[i-1]);
		}
		
		System.out.println(arr[N]);
		br.close();
	}
}
