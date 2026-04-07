package Acmicpc.As.B2.TenThousandth.Zero.Four;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Eligibility10410 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int T = Integer.parseInt(br.readLine()), c = 0, y1 = 0, y2 = 0;
		String str = null, a = null, b = null;
		
		while(T-- > 0) {
			str = br.readLine();
			a = str.split(" ")[1];
			b = str.split(" ")[2];
			c = Integer.parseInt(str.split(" ")[3]);
			sb.append(str.split(" ")[0] + " ");
			y1 = Integer.parseInt(a.split("/")[0]);
			y2 = Integer.parseInt(b.split("/")[0]);
			if (y1 >= 2010 || y2 >= 1991) {
				sb.append("eligible");
			} else if (c >= 41) {
				sb.append("ineligible");
			} else {
				sb.append("coach petitions");
			}
			sb.append("\n");
		}
		System.out.print(sb.toString());
		br.close();
	}
}
