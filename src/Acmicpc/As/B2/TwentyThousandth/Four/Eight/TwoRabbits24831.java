package Acmicpc.As.B2.TwentyThousandth.Four.Eight;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TwoRabbits24831 {
	static int func(int x, int y, int a, int b) {
		return (y-x) % (a+b) != 0 ? -1 : (y-x) / (a+b);
	}
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int T = Integer.parseInt(br.readLine()), x = 0, y = 0, a = 0, b = 0;
		String str = null;
		
		while(T-- > 0) {
			str = br.readLine();
			x = Integer.parseInt(str.split(" ")[0]);
			y = Integer.parseInt(str.split(" ")[1]);
			a = Integer.parseInt(str.split(" ")[2]);
			b = Integer.parseInt(str.split(" ")[3]);
			sb.append(func(x,y,a,b)).append("\n");
		}
		
		System.out.print(sb.toString());
		br.close();
	}
}
