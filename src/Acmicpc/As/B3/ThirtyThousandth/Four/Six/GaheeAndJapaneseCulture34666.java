package Acmicpc.As.B3.ThirtyThousandth.Four.Six;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class GaheeAndJapaneseCulture34666 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int Q = Integer.parseInt(br.readLine()), a = 0, b = 0, c = 0, d = 0, v = 0;
		String str = null;
		
		while(Q-- > 0) {
			str = br.readLine();
			a = Integer.parseInt(str.split(" ")[0]);
			b = Integer.parseInt(str.split(" ")[1]);
			c = Integer.parseInt(str.split(" ")[2]);
			d = Integer.parseInt(str.split(" ")[3]);
			
			if (a > 2 || d < 50) {
				sb.append("NO\n");
				continue;
			}
			v = a == 1 ? 100 : 90;
			sb.append((b*3 < v && c*3 < v) || b <= 21 || c <= 21 ? "YES" : "NO").append("\n");
		}
		
		System.out.print(sb.toString());
		br.close();
	}
}
