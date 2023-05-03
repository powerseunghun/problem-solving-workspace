package Acmicpc.As.B2.SixThousandth.Nine;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ShiftLetters6993 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int T = Integer.parseInt(br.readLine()), n = 0;
		String str = null;
		
		while(T-- > 0) {
			str = br.readLine();
			n = Integer.parseInt(str.split(" ")[1]);
			str = str.split(" ")[0];
			sb.append("Shifting ");
			sb.append(str);
			sb.append(" by ");
			sb.append(n);
			sb.append(" positions gives us: ");
			for (int i = 0, w = str.length()-n; i < str.length(); i++) {
				sb.append(str.charAt(w));
				w++;
				w %= str.length();
			}
			sb.append("\n");
		}

		System.out.print(sb.toString());
		br.close();
	}
}
