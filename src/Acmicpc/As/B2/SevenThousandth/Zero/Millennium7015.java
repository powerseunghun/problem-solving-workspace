package Acmicpc.As.B2.SevenThousandth.Zero;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Millennium7015 {
	static int func(int Y, int M, int D) {
		int a = (Y-1)*195+(Y- 1)/3*5;
		int b = (M-1)*20-(Y%3 != 0?(M - 1) / 2 : 0);
		return a + b + D;
	}
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int n = Integer.parseInt(br.readLine()), Y = 0, M = 0, D = 0;
		String str = null;
		
		while(n-- > 0) {
			str = br.readLine();
			Y = Integer.parseInt(str.split(" ")[0]);
			M = Integer.parseInt(str.split(" ")[1]);
			D = Integer.parseInt(str.split(" ")[2]);
			
			sb.append(func(1000, 1, 1) - func(Y, M, D)).append("\n");
		}
		
		System.out.print(sb.toString());
		br.close();
		
	}
}
