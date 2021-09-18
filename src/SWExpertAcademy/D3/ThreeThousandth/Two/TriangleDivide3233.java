package SWExpertAcademy.D3.ThreeThousandth.Two;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TriangleDivide3233 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		String tmp = null;
		long A = 0, B = 0;
		int T = Integer.parseInt(br.readLine());
		
		for (int i = 1; i <= T; i++) {
			tmp = br.readLine();
			A = Long.parseLong(tmp.split(" ")[0]);
			B = Long.parseLong(tmp.split(" ")[1]);
			sb.append("#" + i + " " + ((A*A)/(B*B)) + "\n");
		}
		System.out.print(sb.toString());
	}
}
