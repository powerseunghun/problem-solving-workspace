package SWExpertAcademy.D3.FourThousandth.Two;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class LoveIsTiming4299 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		String tmp = null;
		int T = Integer.parseInt(br.readLine()), D = 0, H = 0, M = 0;
		long base = (11 * 86400) + (11 * 3600) + (11 * 60), cur = 0;
		
		for (int i = 1; i <= T; i++) {
			cur = 0;
			tmp = br.readLine();
			D = Integer.parseInt(tmp.split(" ")[0]);
			H = Integer.parseInt(tmp.split(" ")[1]);
			M = Integer.parseInt(tmp.split(" ")[2]);
			cur = (D * 86400) + (H * 3600) + (M * 60);
			if (cur < base) {
				sb.append("#" + i + " -1\n");
			}
			else if (cur == base) {
				sb.append("#" + i + " 0\n");
			}
			else {
				sb.append("#" + i + " " + ((cur-base)/60) + "\n");
			}
		}
		System.out.print(sb.toString());
	}
}
