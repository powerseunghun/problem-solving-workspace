package Acmicpc.As.B5.ThirtyThousandth.Three.One;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Blackjack33170 {
	static final int l = 3;
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int s = 0;
		for (int i = 0; i < l; i++) {
			s += Integer.parseInt(br.readLine());
		}
		
		System.out.println(s <= 21 ? 1 : 0);
		br.close();
	}
}
