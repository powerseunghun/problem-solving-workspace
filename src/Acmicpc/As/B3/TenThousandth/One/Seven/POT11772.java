package Acmicpc.As.B3.TenThousandth.One.Seven;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class POT11772 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine()), X = 0;
		
		for (int i = 0, val = 0; i < N; i++) {
			val = Integer.parseInt(br.readLine());
			X += Math.pow(val/10, val%10);
		}
		
		System.out.println(X);
		br.close();
	}
}
