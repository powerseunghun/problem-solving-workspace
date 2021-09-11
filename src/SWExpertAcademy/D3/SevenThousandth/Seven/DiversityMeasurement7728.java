package SWExpertAcademy.D3.SevenThousandth.Seven;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class DiversityMeasurement7728 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int T = Integer.parseInt(br.readLine()), X = 0, val = 0, cnt = 0;
		boolean[] check = new boolean[10];
		
		for (int i = 1; i <= T; i++) {
			Arrays.fill(check, false);
			X = Integer.parseInt(br.readLine());
			cnt = 0;
			while (X != 0) {
				val = X % 10;
				if (!check[val]) {
					check[val] = true;
					cnt++;
				}
				X /= 10;
			}
			sb.append("#" + i + " " + cnt + "\n");
		}
		System.out.print(sb.toString());
	}
}
