package Acmicpc.As.B2.TwentyThousandth.Seven.Nine;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SciComLove27913 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder("SciComLove");
		StringBuilder resSb = new StringBuilder();
		String str = br.readLine();
		int N = Integer.parseInt(str.split(" ")[0]);
		int Q = Integer.parseInt(str.split(" ")[1]), w = 0, res = 0;
		char c = ' ';
		
		while (sb.toString().length() < N) {
			sb.append("SciComLove");
		}
		sb = new StringBuilder(sb.toString().substring(0, N));
		
		res = sb.toString().length() - sb.toString().replaceAll("[A-Z]", "").length();
		
		while(Q-- > 0) {
			w = Integer.parseInt(br.readLine());
			c = sb.charAt(w-1);
			
			if (c >= 'a' && c <= 'z') {
				res++;
				sb.setCharAt(w-1, (char)(c-32));
			}
			else {
				res--;
				sb.setCharAt(w-1, (char)(c+32));
			}
			resSb.append(res).append("\n");
		}
		
		System.out.print(resSb.toString());
		br.close();
	}
}
