package Acmicpc.As.B3.FiveThousandth.Three;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Triangles5356 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int T = Integer.parseInt(br.readLine()), r = 0;
		String tmp = null;
		char c = ' ';
		
		while(T-- > 0) {
			tmp = br.readLine();
			r = Integer.parseInt(tmp.split(" ")[0]);
			c = tmp.split(" ")[1].charAt(0);
			
			for (int i = 0; i < r; i++) {
				for (int j = 0; j <= i; j++) {
					sb.append(c);
				}
				c++;
				c = c > 90 ? 65 : c;
				sb.append("\n");
			}
			if (T == 0) continue;
			sb.append("\n");
		}
		
		System.out.print(sb.toString());
		br.close();
	}
}
