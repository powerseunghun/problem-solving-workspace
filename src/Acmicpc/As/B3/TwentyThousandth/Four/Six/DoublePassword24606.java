package Acmicpc.As.B3.TwentyThousandth.Four.Six;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class DoublePassword24606 {
	static boolean check(String n, String a, String b) {
		for (int i = 0; i < n.length(); i++) {
			if (n.charAt(i) == a.charAt(i) || n.charAt(i) == b.charAt(i)) {
				continue;
			}
			return false;
		}
		return true;
	}
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int res = 0;
		String a = br.readLine();
		String b = br.readLine();
		
		for (int i = 0; i <= 9999; i++) {
			if (check(String.format("%04d", i), a, b)) {
				res++;
			}
		}
		
		System.out.println(res);
		br.close();
	}
}
