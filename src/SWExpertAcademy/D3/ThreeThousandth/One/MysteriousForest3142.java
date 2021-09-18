package SWExpertAcademy.D3.ThreeThousandth.One;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MysteriousForest3142 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		String tmp = null;
		int T = Integer.parseInt(br.readLine()), N = 0, M = 0;
		int X = 0, Y = 0;
		
		for (int i = 1; i <= T; i++) {
			tmp = br.readLine();
			N = Integer.parseInt(tmp.split(" ")[0]);
			M = Integer.parseInt(tmp.split(" ")[1]);
			Y = (2 * M) - N;
			X = M - Y;
			sb.append("#" + i + " " + Y + " " + X + "\n");
		}
		System.out.print(sb.toString());
	}
}
