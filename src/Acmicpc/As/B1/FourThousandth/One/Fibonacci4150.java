package Acmicpc.As.B1.FourThousandth.One;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class Fibonacci4150 {
	static BigInteger[] arr = null;
	static void arrInit() {
		if (arr.length < 1) {
			arr = new BigInteger[1];
		}
		arr[0] = new BigInteger("0");
		arr[1] = new BigInteger("1");
		
		for (int i = 2; i < arr.length; i++) {
			arr[i] = arr[i-2].add(arr[i-1]);
		}
	}
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		arr = new BigInteger[N+1];
		arrInit();
		
		System.out.println(arr[N]);
		br.close();
	}
}
