package SWExpertAcademy.D3.SevenThousandth.Five;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SEMYear7532 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		String tmp = null;
		int T = Integer.parseInt(br.readLine()), S = 0, E = 0, M = 0;
		int ts = 0, te = 0, tm = 0, cnt = 1;
		
		for (int i = 1; i <= T; i++) {
			tmp = br.readLine();
			ts = 1;
			te = 1;
			tm = 1;
			cnt = 1;
			S = Integer.parseInt(tmp.split(" ")[0]);
			E = Integer.parseInt(tmp.split(" ")[1]);
			M = Integer.parseInt(tmp.split(" ")[2]);
			while (ts != S || te != E || tm != M) {
				ts++; te++; tm++;
				if (ts > 365) ts = 1;
				if (te > 24) te = 1;
				if (tm > 29) tm = 1;
				cnt++;
			}
			sb.append("#" + i + " " + cnt + "\n");
		}
		System.out.print(sb.toString());
	}
}
