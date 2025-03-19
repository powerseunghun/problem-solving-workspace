package Acmicpc.As.B2.TwentyThousandth.Nine.Seven;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class NotHouse29734 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		long N = Long.parseLong(str.split(" ")[0]);
		long M = Long.parseLong(str.split(" ")[1]);
		str = br.readLine();
		long T = Long.parseLong(str.split(" ")[0]);
		long S = Long.parseLong(str.split(" ")[1]);
		
		long hw = (N-1)/8;
		long dw = (M-1)/8;
		long c = N+hw*S;
		long d = M+dw*S+T+2*dw*T;
		
		System.out.println(c < d ? "Zip" : "Dok");
		System.out.println(Math.min(c, d));
		br.close();
	}
}
