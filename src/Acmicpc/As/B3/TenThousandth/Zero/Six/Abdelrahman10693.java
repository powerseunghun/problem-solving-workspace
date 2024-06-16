package Acmicpc.As.B3.TenThousandth.Zero.Six;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Abdelrahman10693 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int T = Integer.parseInt(br.readLine()), N = 0, M = 0;
		String str = null;
		
		for (int i = 1; i <= T; i++) {
			str = br.readLine();
			N = Integer.parseInt(str.split(" ")[0]);
			M = Integer.parseInt(str.split(" ")[1]);
			
			sb.append("Case ").append(i).append(": ").append(M-N+1).append("\n");
		}
		
		System.out.print(sb.toString());
		br.close();
	}
}
