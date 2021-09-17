package SWExpertAcademy.D3.FourThousandth.Four;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class InvisibleVowel4406 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		String tmp = null;
		int T = Integer.parseInt(br.readLine());
		
		for (int i = 1; i <= T; i++) {
			tmp = br.readLine();
			sb.append("#" + i + " ");
			for (int j = 0; j < tmp.length(); j++) {
				switch(tmp.charAt(j)) {
				case 'a': case 'e': case 'i': case 'o': case'u':
					break;
				default:
					sb.append(tmp.charAt(j));
				}
			}
			sb.append("\n");
		}
		System.out.print(sb.toString());
	}
}
