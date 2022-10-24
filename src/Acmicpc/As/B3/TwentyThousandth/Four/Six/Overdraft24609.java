package Acmicpc.As.B3.TwentyThousandth.Four.Six;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Overdraft24609 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine()), t = 0, m = 0, res = 0;
		
		while(n-- > 0) {
			t = Integer.parseInt(br.readLine());
			m += t;
			res = Math.min(res, m);
		}
		
		System.out.println(Math.abs(res));
		br.close();
	}
}
