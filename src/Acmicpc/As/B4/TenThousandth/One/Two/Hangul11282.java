package Acmicpc.As.B4.TenThousandth.One.Two;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Hangul11282 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		
		System.out.println((char)(N+44031));
		br.close();
	}
}
