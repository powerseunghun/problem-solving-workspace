package SWExpertAcademy.D3.EightThousandth.Zero;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class OddPyramid8016 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int T = Integer.parseInt(br.readLine());
		long N = 0, l = 0, r = 0;
		
		for (int i = 1; i <= T; i++) {
			N = Long.parseLong(br.readLine());
			l = 1 + ((N-1) * (2 * 2 + (N - 2) * 4)) / 2;
			r = 1 + ((N-1) * (2 * 6 + (N - 2) * 4)) / 2;
			sb.append("#" + i + " " + l + " " + r + "\n");
		}
		System.out.print(sb.toString());
	}
}