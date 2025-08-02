package Acmicpc.As.B5.ThirtyThousandth.Four.Zero;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MatheMatics34052 {
	static int l = 1800;
	static final int r = 5;
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		for (int i = 0; i < r-1; i++) {
			l -= Integer.parseInt(br.readLine());
		}
		
		System.out.println(l-300 >= 0 ? "Yes" : "No");
		br.close();
	}
}
