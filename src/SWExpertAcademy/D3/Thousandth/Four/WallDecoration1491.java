package SWExpertAcademy.D3.Thousandth.Four;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class WallDecoration1491 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		String tmp = null;
		int T = Integer.parseInt(br.readLine());
		long N = 0, A = 0, B = 0, min = 0, sum = 0;
		
		for (int i = 1; i <= T; i++) {
			tmp = br.readLine();
			min = Integer.MAX_VALUE;
			N = Long.parseLong(tmp.split(" ")[0]);
			A = Long.parseLong(tmp.split(" ")[1]);
			B = Long.parseLong(tmp.split(" ")[2]);
			for (int j = 1; j <= N; j++) {
				for (int k = 1; j*k <= N; k++) {
					sum = A * Math.abs(j-k) + B * (N-j*k);
					min = Math.min(min, sum);
				}
			}
			sb.append("#" + i + " " + min + "\n");
		}
		System.out.print(sb.toString());
	}
}
