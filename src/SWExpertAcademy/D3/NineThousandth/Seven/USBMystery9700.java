package SWExpertAcademy.D3.NineThousandth.Seven;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class USBMystery9700 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		String tmp = null;
		int T = Integer.parseInt(br.readLine());
		double p = 0, q = 0, s1 = 0, s2 = 0;
		
		for (int i = 1; i <= T; i++) {
			tmp = br.readLine();
			p = Double.parseDouble(tmp.split(" ")[0]);
			q = Double.parseDouble(tmp.split(" ")[1]);
			s1 = 1*(1-p)*q;
			s2 = 1*p*(1-q)*q;
			if (s1 < s2) sb.append("#" + i + " YES\n");
			else sb.append("#" + i + " NO\n");
		}
		System.out.print(sb.toString());
	}
}
