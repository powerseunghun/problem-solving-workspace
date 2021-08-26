package Acmicpc.NumberTheory.TwoThousandth.Four;

import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;

public class StreetTreeDist2485 {
	static int GCD(int a, int b) {
		if (b % a == 0) return a;
		else return GCD(b%a, a);
	}
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine()), gcd = 0, sum = 0;
		int[] arr = new int[N], diff = new int[N-1];
		for (int i = 0; i < N; i++) {
			arr[i] = Integer.parseInt(br.readLine());
		}
		
		for (int i = 0; i < diff.length; i++) {
			diff[i] = arr[i+1] - arr[i];
			gcd = GCD(diff[i], gcd);
		}
		
		for (int i = 0; i < diff.length; i++) {
			sum += (diff[i] / gcd) -1;
		}
		
		System.out.println(sum);
 	}
}
