package SWExpertAcademy.D3.SixThousandth.Seven;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Perspective6718 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int T = Integer.parseInt(br.readLine()), res = 0;
		double d = 0;
		
		for (int i = 1; i <= T; i++) {
			d = Integer.parseInt(br.readLine()) / 1000.0;
			if (d < 0.1) res = 0;
			else if (d < 1) res = 1;
			else if (d < 10) res = 2;
			else if (d < 100) res = 3;
			else if (d < 1000) res = 4;
			else res = 5;
			sb.append("#" + i + " " + res + "\n");
		}
		System.out.print(sb.toString());
	}
}
