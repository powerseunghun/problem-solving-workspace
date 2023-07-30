package Acmicpc.As.B2.TenThousandth.Five.Eight;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class VirusOutbreak15841 {
	static final int limit = 491;
	static BigInteger[] arr = new BigInteger[limit];
	static void arrInit() {
		arr[0] = new BigInteger("0");
		arr[1] = new BigInteger("1");
		for (int i = 2; i < arr.length; i++) {
			arr[i] = arr[i-1].add(arr[i-2]);
		}
	}
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int v = 0;
		arrInit();
		
		while(true) {
			v = Integer.parseInt(br.readLine());
			if (v == -1) break;
			
			sb.append("Hour " + v + ": " + arr[v] + " cows(s) affected").append("\n");
		}
		
		System.out.print(sb.toString());
		br.close();
	}
}
