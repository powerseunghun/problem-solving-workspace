package Acmicpc.String.TenThousandth.Eight.Four;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class LuckyStraight18406 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int sum1 = 0, sum2 = 0;
		String str = br.readLine();
		
		for (int i = 0; i < str.length()/2; i++) {
			sum1 += str.charAt(i) -'0';
		}
		for (int i = str.length()/2; i < str.length(); i++) {
			sum2 += str.charAt(i) - '0';
		}
		if (sum1 == sum2) System.out.println("LUCKY");
		else System.out.println("READY");
	}
}
