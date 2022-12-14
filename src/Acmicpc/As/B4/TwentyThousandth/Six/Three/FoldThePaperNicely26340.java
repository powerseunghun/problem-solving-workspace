package Acmicpc.As.B4.TwentyThousandth.Six.Three;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FoldThePaperNicely26340 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int n = Integer.parseInt(br.readLine()), a = 0, b = 0, c = 0, max = 0, min = 0;
		String tmp = null;
		
		while(n-- > 0) {
			tmp = br.readLine();
			a = Integer.parseInt(tmp.split(" ")[0]);
			b = Integer.parseInt(tmp.split(" ")[1]);
			c = Integer.parseInt(tmp.split(" ")[2]);
			sb.append("Data set: " + a + " " + b + " " + c + "\n");
			while(c-- > 0) {
				max = Math.max(a, b);
				min = Math.min(a, b);
				a = max/2;
				b = min;
			}
			sb.append(Math.max(a, b) + " " + Math.min(a,b) + "\n\n");
		}
		
		System.out.print(sb.toString());
		br.close();
	}
}
