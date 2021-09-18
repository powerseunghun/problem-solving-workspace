package SWExpertAcademy.D3.ThreeThousandth.Nine;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CompareWinRate3975 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		String tmp = null;
		double cmp = 0;
		int T = Integer.parseInt(br.readLine()), A = 0, B = 0, C = 0, D = 0;
		
		for (int i = 1; i <= T; i++) {
			tmp = br.readLine();
			A = Integer.parseInt(tmp.split(" ")[0]);
			B = Integer.parseInt(tmp.split(" ")[1]);
			C = Integer.parseInt(tmp.split(" ")[2]);
			D = Integer.parseInt(tmp.split(" ")[3]);
			cmp = (A/(double)B*100) - (C/(double)D*100);
			if (cmp > 0) {
				sb.append("#" + i + " " + "ALICE\n");
			}
			else if (cmp < 0) {
				sb.append("#" + i + " " + "BOB\n");
			}
			else {
				sb.append("#" + i + " " + "DRAW\n");
			}
		}
		System.out.print(sb.toString());
	}
}
