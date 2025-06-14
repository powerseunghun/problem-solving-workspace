package Acmicpc.As.B2.ThirtyThousandth.Two.Six;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ClubMoneySeizure32621 {
	static boolean func(String str) {
		for (int i = 0; i < str.length(); i++) {
			char c = str.charAt(i);
			if (c < '0' || c > '9') return false;
		}
		return !str.isEmpty() && str.charAt(0) != '0';
	}
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		String a = str.split("\\+")[0];
		String b = str.split("\\+")[1];
		
		System.out.println(func(a) && func(b) && a.equals(b) ? "CUTE" : "No Money");
		br.close();
	}
}
