package Acmicpc.As.B3.ThirtyThousandth.Four.Nine;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Lot34998 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int X = Integer.parseInt(br.readLine()), v = 0;
		String str = null;
		
		while(X-- > 0) {
			br.readLine();
			v = 0;
			str = br.readLine();
			
			if (str.contains("!")) {
				sb.append("!");
			} else {
				for (int i = 0; i < str.split(" \\+ ").length; i++) {
					v += Integer.parseInt(str.split(" \\+ ")[i]);
				}
				sb.append(v >= 10 ? "!" : v);
			}
			sb.append("\n");
		}
		
		System.out.print(sb.toString());
		br.close();
	}
}
