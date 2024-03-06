package Acmicpc.As.B4.ThirtyThousandth.Zero.Four;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class GammaComputer30402 {
	static final int line = 15;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = null;
		int res = 0;
		for (int i = 0; i < line; i++) {
			str = br.readLine();
			if (str.contains("w")) {
				res = 1;
			}
			else if (str.contains("b")) {
				res = 2;
			}
			else if (str.contains("g")) {
				res = 3;
			}
		}
		
		System.out.println(res == 1 ? "chunbae" : res == 2 ? "nabi" : "yeongcheol");
		br.close();
	}
}
