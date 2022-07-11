package Acmicpc.As.B3.TenThousandth.Zero.One;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class DiceGame10103 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine()), c = 100, s = 100;
		String tmp = null;
		
		for (int i = 0, d1 = 0, d2 = 0; i < n; i++) {
			tmp = br.readLine();
			d1 = Integer.parseInt(tmp.split(" ")[0]);
			d2 = Integer.parseInt(tmp.split(" ")[1]);
			if (d1 > d2) s -= d1;
			else if (d1 < d2) c -= d2;
		}
		
		System.out.println(c);
		System.out.println(s);
		br.close();
	}
}
