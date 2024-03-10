package Acmicpc.As.B4.TwentyThousandth.Seven.Eight;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class SpecialFraction27890 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		int x0 = Integer.parseInt(str.split(" ")[0]);
		int N = Integer.parseInt(str.split(" ")[1]);
		
		while(N-- > 0) {
			x0 = x0 % 2 == 0 ? x0/2^6 : x0*2^6;
		}
		
		System.out.println(x0);
		br.close();
	}
}
