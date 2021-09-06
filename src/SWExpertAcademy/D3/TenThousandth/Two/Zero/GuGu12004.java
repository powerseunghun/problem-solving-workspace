package SWExpertAcademy.D3.TenThousandth.Two.Zero;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class GuGu12004 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int T = Integer.parseInt(br.readLine()), N = 0;
		boolean flag = false;
		
		for (int i = 1; i <= T; i++) {
			N = Integer.parseInt(br.readLine());
			flag = false;
			for (int a = 1; a <= 9; a++) {
				for (int b = 1; b <= 9; b++) {
					if (a * b == N) flag = true;
				}
			}
			if (flag) sb.append("#" + i + " Yes\n");
			else sb.append("#" + i + " No\n");
		}
		System.out.print(sb.toString());
	}
}
