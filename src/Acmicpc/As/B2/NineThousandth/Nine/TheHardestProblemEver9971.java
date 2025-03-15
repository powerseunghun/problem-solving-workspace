package Acmicpc.As.B2.NineThousandth.Nine;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TheHardestProblemEver9971 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		String str = null;
		
		while (true) {
			str = br.readLine();
			if (str.equals("ENDOFINPUT")) break;
			String b = br.readLine();
			br.readLine();
			
			for (int i = 0; i < b.length(); i++) {
				char c = b.charAt(i);
				sb.append(c >= 'A' && c <= 'Z' ? (char)((c-'A'+21)%26+'A') : c);
			}
			sb.append("\n");
		}
		System.out.print(sb.toString());
		br.close();
	}
}
