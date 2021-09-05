package SWExpertAcademy.D2.Thousandth.Two;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class WaterTaxCompetition1284 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		String tmp = null;
		int T = Integer.parseInt(br.readLine());
		int P = 0, Q = 0, R = 0, S = 0, W = 0, p1 = 0, p2 = 0;
		
		for (int i = 1; i <= T; i++) {
			tmp = br.readLine();
			P = Integer.parseInt(tmp.split(" ")[0]);
			Q = Integer.parseInt(tmp.split(" ")[1]);
			R = Integer.parseInt(tmp.split(" ")[2]);
			S = Integer.parseInt(tmp.split(" ")[3]);
			W = Integer.parseInt(tmp.split(" ")[4]);
			p1 = W * P;
			p2 = W <= R ? Q : ((W-R) * S) + Q;
			sb.append("#" + i + " " + Math.min(p1, p2) + "\n");
		}
		System.out.print(sb.toString());
	}
}
