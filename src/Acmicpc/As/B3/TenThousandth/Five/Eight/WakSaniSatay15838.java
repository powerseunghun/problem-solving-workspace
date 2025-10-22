package Acmicpc.As.B3.TenThousandth.Five.Eight;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class WakSaniSatay15838 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int idx = 1, N = 0, a = 0, b = 0, c = 0, d = 0;
		String str = null;
		
		while(true) {
			N = Integer.parseInt(br.readLine());
			if (N == 0) break;
			double res = 0.0;
			
			for (int i = 0; i < N; i++) {
				str = br.readLine();
				a = Integer.parseInt(str.split(" ")[0]);
				b = Integer.parseInt(str.split(" ")[1]);
				c = Integer.parseInt(str.split(" ")[2]);
				d = Integer.parseInt(str.split(" ")[3]);
				
				res += (a*0.8) + (b*1.0) + (c*1.2) + (d*0.8);
				res -= (a*15.5 + b*32.0 + c*40.0) / 85 + d * 0.20;
			}
			sb.append("Case #").append(idx++).append(": RM").append(String.format("%.2f", res)).append("\n");
		}
		
		System.out.print(sb.toString());
		br.close();
	}
}
