package Acmicpc.As.B4.TwentyThousandth.Four.Eight;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CountingAntibodies24860 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		long res = 0, mul = 0;
		String tmp = null;
		
		for (int i = 0; i < 3; i++) {
			tmp = br.readLine();
			mul = 1;
			switch(i) {
			case 0: case 1:
				for (int j = 0; j <= 1; j++) {
					mul *= Long.parseLong(tmp.split(" ")[j]);
				}
				res += mul;
				break;
			case 2:
				for (int j = 0; j <= 2; j++) {
					mul *= Long.parseLong(tmp.split(" ")[j]);
				}
				res *= mul;
				break;
			}
		}
		
		System.out.println(res);
		br.close();
	}
}
