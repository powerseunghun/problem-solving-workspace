package SWExpertAcademy.D3.TenThousandth.Zero.Nine;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MakePowerNumber10965 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int T = Integer.parseInt(br.readLine());
		long A = 0;
		double tmp = 0;
		
		for (int i = 1; i <= T; i++) {
			A = Long.parseLong(br.readLine());
			for (int j = 1; ; j++) {
				tmp = Math.sqrt(A*j);
				if (tmp == (int)tmp) {
					sb.append("#" + i + " " + j + "\n");
					break;
				}
			}
		}
		System.out.print(sb.toString());
	}
}
