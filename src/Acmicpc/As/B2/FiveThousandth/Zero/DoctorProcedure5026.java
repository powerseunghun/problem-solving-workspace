package Acmicpc.As.B2.FiveThousandth.Zero;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class DoctorProcedure5026 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int N = Integer.parseInt(br.readLine()), a = 0, b = 0;
		String tmp = null;
		
		while(N-- > 0) {
			tmp = br.readLine();
			if (tmp.contains("=")) {
				sb.append("skipped").append("\n");
				continue;
			}
			a = Integer.parseInt(tmp.split("\\+")[0]);
			b = Integer.parseInt(tmp.split("\\+")[1]);
			sb.append((a+b)).append("\n");
		}
		
		System.out.print(sb.toString());
		br.close();
	}
}
