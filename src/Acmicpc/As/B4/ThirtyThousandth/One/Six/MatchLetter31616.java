package Acmicpc.As.B4.ThirtyThousandth.One.Six;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MatchLetter31616 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		br.readLine();
		String str = br.readLine();
		
		System.out.println(str.replaceAll(str.substring(0,1), "").length() == 0 ? "Yes" : "No");
		br.close();
	}
}
