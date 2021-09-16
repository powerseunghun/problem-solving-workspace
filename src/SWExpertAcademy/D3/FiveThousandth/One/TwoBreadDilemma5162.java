package SWExpertAcademy.D3.FiveThousandth.One;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TwoBreadDilemma5162 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		String tmp = null;
		int T = Integer.parseInt(br.readLine()), A = 0, B = 0, C = 0;
		
		for (int i = 1 ; i <= T; i++) {
			tmp = br.readLine();
			A = Integer.parseInt(tmp.split(" ")[0]);
			B = Integer.parseInt(tmp.split(" ")[1]);
			C = Integer.parseInt(tmp.split(" ")[2]);
			sb.append("#" + i + " " + (C/(Math.min(A, B))) + "\n");
		}
		System.out.print(sb.toString());
	}
}
