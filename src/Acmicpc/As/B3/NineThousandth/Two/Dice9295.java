package Acmicpc.As.B3.NineThousandth.Two;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Dice9295 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int t = Integer.parseInt(br.readLine()), a = 0, b = 0;
		String tmp = null;
		
		for (int i = 1; i <= t; i++) {
			tmp = br.readLine();
			a = Integer.parseInt(tmp.split(" ")[0]);
			b = Integer.parseInt(tmp.split(" ")[1]);
			sb.append("Case " + i + ": " + (a+b) + "\n");
		}
		
		System.out.print(sb.toString());
		br.close();
	}
}
