package Acmicpc.As.B4.TwentyThousandth.Eight.Two;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FinalPrice28224 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine()), r = 0;
		
		while(N-- > 0) {
			r += Integer.parseInt(br.readLine());
		}
		
		System.out.println(r);
		br.close();
	}
}
