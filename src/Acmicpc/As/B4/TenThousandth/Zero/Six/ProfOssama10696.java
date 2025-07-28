package Acmicpc.As.B4.TenThousandth.Zero.Six;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ProfOssama10696 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int T = Integer.parseInt(br.readLine()), x = 0, res = 0;
		String str = null;
		
		for (int i = 1; i <= T; i++) {
			str = br.readLine();
			x = Integer.parseInt(str.split(" ")[1]);
			str = str.split(" ")[0];
			
			res = 0;
			for (int j = 0; j < str.length(); j++) {
				res = (res*10+str.charAt(j)-'0') % x;
			}
			sb.append("Case ").append(i).append(": ").append(res).append("\n");
		}
		
		System.out.print(sb.toString());
		br.close();
	}
}
