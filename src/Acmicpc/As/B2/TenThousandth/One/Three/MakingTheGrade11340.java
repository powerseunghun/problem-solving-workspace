package Acmicpc.As.B2.TenThousandth.One.Three;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MakingTheGrade11340 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int T = Integer.parseInt(br.readLine()), a = 0, b = 0, c = 0, res = 0;
		String str = null;
		
		while(T-- > 0) {
			str = br.readLine();
			a = Integer.parseInt(str.split(" ")[0]);
			b = Integer.parseInt(str.split(" ")[1]);
			c = Integer.parseInt(str.split(" ")[2]);
			res = (9000-a*15-b*20-c*25+39) / 40;
			
			sb.append(res > 100 ? "impossible" : res).append("\n");
		}
		
		System.out.print(sb.toString());
		br.close();
	}
}
