package Acmicpc.As.B3.FiveThousandth.Zero;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class CardCutting5087 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st = null;
		String tmp = null;
		int c = 0, t = 0;
		
		while (true) {
			c = 0;
			t = 0;
			st = new StringTokenizer(br.readLine());
			while (st.hasMoreTokens()) {
				tmp = st.nextToken();
				if (tmp.equals("*") || tmp.equals("#")) break;
				if (Integer.parseInt(tmp.equals("A") ? "1" : tmp) % 2 == 0) t++;
				else c++;
			}
			if (c == 0 && t == 0) break;
			
			if (t > c) sb.append("Tania\n");
			else if (t < c) sb.append("Cheryl\n");
			else sb.append("Draw\n");
		}
		
		System.out.print(sb.toString());
		br.close();
	}
}
