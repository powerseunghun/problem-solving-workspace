package SWExpertAcademy.D2.Thousandth.Nine;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ZigZagNumber1986 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int T = Integer.parseInt(br.readLine()), N = 0, sum = 0;
		
		for (int i = 1; i <= T; i++) {
			sum = 0;
			N = Integer.parseInt(br.readLine());
			for (int j = 1; j <= N; j++) {
				sum = j % 2 == 0 ? sum - j : sum + j;
			}
			sb.append("#" + i + " " + sum + "\n");
		}
		System.out.print(sb.toString());
	}
}
