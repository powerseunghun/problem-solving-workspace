package Acmicpc.As.B2.NineThousandth.Two;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CompleteDeletion92423 {
	static String check(String base, String res, int N) {
		for (int i = 0; i < base.length(); i++) {
			if (N % 2 != 0) {
				if (base.charAt(i) == res.charAt(i)) return "failed";
			}
			else {
				if (base.charAt(i) != res.charAt(i)) return "failed";
			}
		}
		return "succeeded";
	}
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		String base = br.readLine();
		String res = br.readLine();
		
		System.out.println("Deletion " + check(base, res, N));
		br.close();
	}
}
