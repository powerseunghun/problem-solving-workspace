package SWExpertAcademy.D3.ThreeThousandth.Four;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ExerciseManagement3431 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		String tmp = null;
		int T = Integer.parseInt(br.readLine()), L = 0, U = 0, X = 0, val = 0;
		
		for (int i = 1; i <= T; i++) {
			tmp = br.readLine();
			L = Integer.parseInt(tmp.split(" ")[0]);
			U = Integer.parseInt(tmp.split(" ")[1]);
			X = Integer.parseInt(tmp.split(" ")[2]);
			val = 0;
			if (!(X >= L && X <= U)) {
				if (X < L) val = L-X;
				else if (X > U) val = -1;
 			}
			sb.append("#" + i + " " + val + "\n");
		}
		System.out.print(sb.toString());
	}
}
