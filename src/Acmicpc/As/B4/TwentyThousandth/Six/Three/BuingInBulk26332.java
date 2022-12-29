package Acmicpc.As.B4.TwentyThousandth.Six.Three;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BuingInBulk26332 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int T = Integer.parseInt(br.readLine()), a = 0, b = 0, res = 0;
		String tmp = null;
		
		while(T-- > 0) {
			tmp = br.readLine();
			a = Integer.parseInt(tmp.split(" ")[0]);
			b = Integer.parseInt(tmp.split(" ")[1]);
			res = a*b - ((a-1)*2);
			sb.append(tmp + "\n" + res + "\n");
		}
		
		System.out.print(sb.toString());
		br.close();
	}
}
