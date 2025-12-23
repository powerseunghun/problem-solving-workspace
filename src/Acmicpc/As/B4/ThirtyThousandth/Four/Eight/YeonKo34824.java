package Acmicpc.As.B4.ThirtyThousandth.Four.Eight;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class YeonKo34824 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine()), f1 = 0, f2 = 0;
		String str = null;
		
		for (int i = 0; i < N; i++) {
			str = br.readLine();
			if (str.equalsIgnoreCase("yonsei")) {
				f1 = i;
			} else if (str.equalsIgnoreCase("korea")) {
				f2 = i;
			}
		}
		
		System.out.println(f1 < f2 ? "Yonsei Won!" : "Yonsei Lost...");
		br.close();
	}
}
