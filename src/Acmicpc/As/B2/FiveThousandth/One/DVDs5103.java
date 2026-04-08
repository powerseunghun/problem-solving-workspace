package Acmicpc.As.B2.FiveThousandth.One;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class DVDs5103 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		String L = null, str = null;
		int M = 0, S = 0, T = 0, N = 0;
		char R = ' ';
		
		while(true) {
			L = br.readLine();
			if (L.equals("#")) {
				break;
			}
			str = br.readLine();
			M = Integer.parseInt(str.split(" ")[0]);
			S = Integer.parseInt(str.split(" ")[1]);
			T = Integer.parseInt(br.readLine());
			
			while(T-- > 0) {
				str = br.readLine();
				R = str.split(" ")[0].charAt(0);
				N = Integer.parseInt(str.split(" ")[1]);
				if (R == 'S') {
					S = Math.max(0,  S-N);
				} else if (R == 'R') {
					S = Math.min(M, S+N);
				}
			}
			sb.append(L).append(" ").append(S).append("\n");
		}
		
		System.out.print(sb.toString());
		br.close();
	}
}
