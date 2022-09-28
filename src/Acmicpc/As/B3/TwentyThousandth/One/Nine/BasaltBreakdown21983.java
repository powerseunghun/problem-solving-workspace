package Acmicpc.As.B3.TwentyThousandth.One.Nine;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BasaltBreakdown21983 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		long a = Long.parseLong(br.readLine());
		
		System.out.println(Math.sqrt(a*2*Math.sqrt(3)/9)*6);
		br.close();
	}
}
