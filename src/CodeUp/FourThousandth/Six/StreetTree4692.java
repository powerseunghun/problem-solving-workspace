package CodeUp.FourThousandth.Six;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class StreetTree4692 {
	static int GCD(int a, int b) {
		if (b % a == 0) return a;
		else return GCD(b%a, a);
	}
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine()), gcd = 0, diff = 0, sum = 0;
		int[] arr = new int[N];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = Integer.parseInt(br.readLine());
			if (i != 0) {
				diff = arr[i]-arr[i-1];
				gcd = GCD(diff, gcd);
			}
		}
		
		for (int i = 1; i < arr.length; i++) {
			diff = arr[i]-arr[i-1];
			sum += (diff / gcd) - 1;
		}
		
		System.out.println(sum);
	}
}
