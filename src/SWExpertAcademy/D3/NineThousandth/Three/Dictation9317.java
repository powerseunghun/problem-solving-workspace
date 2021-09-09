package SWExpertAcademy.D3.NineThousandth.Three;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Dictation9317 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int T = Integer.parseInt(br.readLine()), N = 0, cnt = 0;
		String s1 = null, s2 = null;
		
		for (int i = 1; i <= T; i++) {
			N = Integer.parseInt(br.readLine());
			cnt = 0;
			s1 = br.readLine();
			s2 = br.readLine();
			for (int j = 0; j < s1.length(); j++) {
				if (s1.charAt(j) != s2.charAt(j)) cnt++;
			}
			sb.append("#" + i + " " + (N-cnt) + "\n");
		}
		System.out.print(sb.toString());
	}
}
