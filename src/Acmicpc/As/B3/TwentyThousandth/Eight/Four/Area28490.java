package Acmicpc.As.B3.TwentyThousandth.Eight.Four;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Area28490 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine()), a = 0, b = 0, res = 0;
		String str = null;
		
		while(n-- > 0) {
			str = br.readLine();
			a = Integer.parseInt(str.split(" ")[0]);
			b = Integer.parseInt(str.split(" ")[1]);
			res = Math.max(res, a*b);
		}
		
		System.out.println(res);
		br.close();
	}
}
