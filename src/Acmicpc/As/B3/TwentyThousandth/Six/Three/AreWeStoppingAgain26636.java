package Acmicpc.As.B3.TwentyThousandth.Six.Three;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class AreWeStoppingAgain26636 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int t = Integer.parseInt(br.readLine()), a = 0, b = 0, c = 0, res = 0;
		String str = null;
		
		while(t-- > 0) {
			str = br.readLine();
			sb.append(str).append("\n");
			a = Integer.parseInt(str.split(" ")[0]);
			b = Integer.parseInt(str.split(" ")[1]);
			c = Integer.parseInt(str.split(" ")[2]);
			
			res = 0;
			for (int i = 1; i < a; i++) {
				if (i%b == 0 || i % c == 0) res++;
			}
			sb.append(res).append("\n");
		}
		
		System.out.print(sb.toString());
		br.close();
	}
}
