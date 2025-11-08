package Acmicpc.As.B2.TwentyThousandth.Two.Three;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class RectangleArea22341 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		int N = Integer.parseInt(str.split(" ")[0]);
		int C = Integer.parseInt(str.split(" ")[1]);
		int a = N, b = N, X = 0, Y = 0;
		
		while(C-- > 0) {
			str = br.readLine();
			X = Integer.parseInt(str.split(" ")[0]);
			Y = Integer.parseInt(str.split(" ")[1]);
			if (X >= a || Y >= b) continue;
			if (X * b >= a * Y) a = X;
			else b = Y;
		}
		System.out.println(a*b);
		br.close();
	}
}
