package SWExpertAcademy.D3.FourThousandth.Seven;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class StandingOvation4789 {
	static int func(String str) {
		int n = 0, s = 0;
		for (int i = 0; i < str.length(); i++) {
			if (n >= i) n += (str.charAt(i) - '0');
			else if (i > n && str.charAt(i) != '0') {
				s += (i - n);
				n += ((i - n) + (str.charAt(i) - '0'));
			}
		}
		return s;
	}
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		String str = null;
		int T = Integer.parseInt(br.readLine());
		
		for (int i = 1; i <= T; i++) {
			str = br.readLine();
			sb.append("#" + i + " " + func(str) + "\n");
		}
		System.out.print(sb.toString());
	}
}
