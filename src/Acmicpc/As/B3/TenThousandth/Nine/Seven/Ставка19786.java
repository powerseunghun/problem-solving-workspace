package Acmicpc.As.B3.TenThousandth.Nine.Seven;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Ставка19786 {
	static int func(int a, int c, int r, int g, int b) {
		int t1 = a*(r*r+g*g+b*b);
		int t2 = c*(Math.min(r, Math.min(g, b)));
		return t1+t2;
	}
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int T = Integer.parseInt(br.readLine()), a = 0, c = 0, r = 0, g = 0, b = 0;
		int v1 = 0, v2 = 0, v3 = 0;
		String str = null;
		
		while(T-- > 0) {
			str = br.readLine();
			a = Integer.parseInt(str.split(" ")[0]);
			c = Integer.parseInt(str.split(" ")[1]);
			str = br.readLine();
			r = Integer.parseInt(str.split(" ")[0]);
			g = Integer.parseInt(str.split(" ")[1]);
			b = Integer.parseInt(str.split(" ")[2]);
			
			v1 = func(a, c, r+1, g, b);
			v2 = func(a, c, r, g+1, b);
			v3 = func(a, c, r, g, b+1);
			sb.append((v1>=v2 && v1 >= v3) ? "RED" : v2 >= v3 ? "GREEN" : "BLUE").append("\n");
		}
		
		System.out.print(sb.toString());
		br.close();
	}
}
