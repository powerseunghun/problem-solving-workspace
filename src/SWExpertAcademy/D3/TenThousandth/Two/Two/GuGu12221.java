package SWExpertAcademy.D3.TenThousandth.Two.Two;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class GuGu12221 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		String tmp = null;
		int T = Integer.parseInt(br.readLine()), A = 0, B = 0;
		
		for (int i = 1, val = 0; i <= T; i++) {
			tmp = br.readLine();
			A = Integer.parseInt(tmp.split(" ")[0]);
			B = Integer.parseInt(tmp.split(" ")[1]);
			if (A >= 10 || B >= 10) val = -1;
			else {
				val = A * B;
			}
			sb.append("#" + i + " " + val + "\n");
		}
		System.out.print(sb.toString());
	}
}
