package Acmicpc.As.B3.TenThousandth.Zero.Two;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class DiceGame10262 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String tmp = null;
		int a1 = 0, b1 = 0, a2 = 0, b2 = 0;
		int g1 = 0, s1 = 0, g2 = 0, s2 = 0;
		for (int i = 0; i < 2; i++) {
			tmp = br.readLine();
			a1 = Integer.parseInt(tmp.split(" ")[0]);
			b1 = Integer.parseInt(tmp.split(" ")[1]);
			a2 = Integer.parseInt(tmp.split(" ")[2]);
			b2 = Integer.parseInt(tmp.split(" ")[3]);
			
			if (i == 0) {
				g1 = a1+a2;
				s1 = b1+b2;
			}
			else {
				g2 = a1+a2;
				s2 = b1+b2;
			}
		}
		if (g1-g2 + s1-s2 == 0) System.out.println("Tie");
		else if (g1-g2 + s1-s2 > 0) System.out.println("Gunnar");
		else System.out.println("Emma");
		
		br.close();
	}
}
