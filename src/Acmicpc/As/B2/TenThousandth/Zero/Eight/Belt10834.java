package Acmicpc.As.B2.TenThousandth.Zero.Eight;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Belt10834 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int M = Integer.parseInt(br.readLine()), a = 0, b = 0, s = 0;
		int r1 = 0, r2 = 1;
		String str = null;
		
		while(M-- > 0) {
			str = br.readLine();
			a = Integer.parseInt(str.split(" ")[0]);
			b = Integer.parseInt(str.split(" ")[1]);
			s = Integer.parseInt(str.split(" ")[2]);
			r1 ^= s;
			r2 = r2/a*b;
		}
		
		System.out.println(r1 + " " + r2);
		br.close();
	}
}
