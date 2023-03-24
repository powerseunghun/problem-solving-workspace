package Acmicpc.As.B4.TenThousandth.Six.Zero;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FindingYourCoach16088 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		String str = null;
		int N = Integer.parseInt(br.readLine()), l = 0, r = 0, f = 0, s = 0;
		int lIdx = 0, rIdx = 0;
		
		while(N-- > 0) {
			str = br.readLine();
			l = Integer.parseInt(str.split(" ")[0]);
			r = Integer.parseInt(str.split(" ")[1]);
			f = Integer.parseInt(str.split(" ")[2]);
			s = Integer.parseInt(str.split(" ")[3]);
			lIdx = 0; rIdx = 0;
			if (f == s) {
				sb.append("G").append("\n");
				continue;
			}
			
			if(f-l <= s && s <= f) {
				lIdx++;
			}
			if(f <= s && s <= f+r) {
				rIdx++;
			}
			if (f <= s && s <= f+l) {
				lIdx++;
			}
			if (f-r <= s && s <= f) {
				rIdx++;
			}
			if (lIdx > 0 && rIdx == 0) {
				sb.append("L");
			}
			else if (rIdx > 0 && lIdx == 0) {
				sb.append("R");
			}
			else sb.append("E");
			
			sb.append("\n");
		} 
		
		System.out.print(sb.toString());
		br.close();
	}
}
