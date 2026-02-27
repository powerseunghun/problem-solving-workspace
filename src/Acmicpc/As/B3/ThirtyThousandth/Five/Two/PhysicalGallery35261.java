package Acmicpc.As.B3.ThirtyThousandth.Five.Two;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PhysicalGallery35261 {
	private static String t = "eagle";
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine()), res = 5;
		String S = br.readLine();
		
		for (int i = 0, v = 0; i < N-4; i++, v = 0) {
			for (int j = 0; j < 5; j++) {
				if (S.charAt(i+j) != t.charAt(j)) {
					v++;
				}
			}
			res = Math.min(res,  v);
		}
		
		System.out.println(res);
		br.close();
	}
}
