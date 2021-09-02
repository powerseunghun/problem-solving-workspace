package SWExpertAcademy.D2.TwoThousandth.Seven;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TimeAdd2711 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		String tmp = null;
		int T = Integer.parseInt(br.readLine()), h1 = 0, m1 = 0, h2 = 0, m2 = 0;
		int resH = 0, resM = 0;
		
		for (int i = 1; i <= T; i++) {
			tmp = br.readLine();
			h1 = Integer.parseInt(tmp.split(" ")[0]);
			m1 = Integer.parseInt(tmp.split(" ")[1]);
			h2 = Integer.parseInt(tmp.split(" ")[2]);
			m2 = Integer.parseInt(tmp.split(" ")[3]);
			resH = h1 + h2; 
			resM = m1 + m2;
			if (resM >= 60) {
				resH += resM / 60;
				resM %= 60;
			}
			if (resH > 12) {
				resH %= 12;
				if (resH == 0) resH = 12;
			}
			sb.append("#" + i + " " + resH + " " + resM + "\n");
		}
		System.out.print(sb.toString());
	}
}
