package Acmicpc.As.B4.ThirtyThousandth.Four.Three;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class NeedDiscount34323 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		long N = Long.parseLong(str.split(" ")[0]);
		long M = Long.parseLong(str.split(" ")[1]);
		long S = Long.parseLong(str.split(" ")[2]);
		long t = (M+1)*S;
		long res1 = (int)(t - (t*N/100.0));
		long res2 = M*S;
		
		System.out.println(Math.min(res1, res2));
		br.close();
		
	}
}
