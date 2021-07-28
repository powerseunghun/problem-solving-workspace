package Acmicpc.String.TenThousandth.Zero.Seven;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class HappyOrSad10769 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		int happyCount = 0, sadCount = 0;
		if (!str.contains(":-)") && !str.contains(":-(")) {
			System.out.println("none");
			return;
		}
		
		for (int i = 0; i < str.length()-2; i++) {
			if (str.charAt(i) == ':' && str.charAt(i+1) == '-') {
				if (str.charAt(i+2) == ')') happyCount++;
				else if (str.charAt(i+2) == '(') sadCount++;
			}
		}
		if (happyCount == sadCount) System.out.println("unsure");
		else if (happyCount > sadCount) System.out.println("happy");
		else System.out.println("sad");
		
	}
}
