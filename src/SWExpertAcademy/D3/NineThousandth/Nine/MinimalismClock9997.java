package SWExpertAcademy.D3.NineThousandth.Nine;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MinimalismClock9997 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int T = Integer.parseInt(br.readLine()), angle = 0, h = 0, m = 0;
		
		for (int i = 1; i <= T; i++) {
			angle = Integer.parseInt(br.readLine());
			h = 0 + (angle / 30);
			m = (angle % 30) * 2;
			sb.append("#" + i + " " + h + " " + m + "\n");
		}
		System.out.print(sb.toString());
	}
}
