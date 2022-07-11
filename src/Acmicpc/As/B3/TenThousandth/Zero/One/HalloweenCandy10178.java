package Acmicpc.As.B3.TenThousandth.Zero.One;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class HalloweenCandy10178 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		String tmp = null;
		int n = Integer.parseInt(br.readLine()), c = 0, v = 0;
		
		for (int i = 0; i < n; i++) {
			tmp = br.readLine();
			c = Integer.parseInt(tmp.split(" ")[0]);
			v = Integer.parseInt(tmp.split(" ")[1]);
			sb.append("You get " + (c/v) + " piece(s) and your dad gets " + (c%v) + " piece(s).\n");
		}
		
		System.out.print(sb.toString());
		br.close();
	}
}
