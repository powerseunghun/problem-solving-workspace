package Acmicpc.As.B4.TwentyThousandth.Two.One;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Простаязадача22155 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int N = Integer.parseInt(br.readLine()), a = 0, b = 0;
		String tmp = null;
		
		while (N-- > 0) {
			tmp = br.readLine();
			a = Integer.parseInt(tmp.split(" ")[0]);
			b = Integer.parseInt(tmp.split(" ")[1]);
			if ((a <= 1 && b <= 2) || (a <= 2 && b <= 1)) {
				sb.append("Yes\n");
			}
			else sb.append("No\n");
		}
		
		System.out.print(sb.toString());
		br.close();
	}
}
