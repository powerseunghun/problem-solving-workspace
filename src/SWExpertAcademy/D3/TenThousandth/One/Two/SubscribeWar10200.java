package SWExpertAcademy.D3.TenThousandth.One.Two;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SubscribeWar10200 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		String tmp = null;
		int T = Integer.parseInt(br.readLine()), N = 0, A = 0, B = 0;
		
		for (int i = 1; i <= T; i++) {
			tmp = br.readLine();
			N = Integer.parseInt(tmp.split(" ")[0]);
			A = Integer.parseInt(tmp.split(" ")[1]);
			B = Integer.parseInt(tmp.split(" ")[2]);
			if (A+B <= N) {
				sb.append("#" + i + " " + Math.min(A, B) + " 0\n");
			}
			else sb.append("#" + i + " " + Math.min(A, B) + " " + (A+B-N) + "\n");
		}
		System.out.print(sb.toString());
	}
}
