package Acmicpc.As.B2.TwentyThousandth.Eight.Seven;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Звукивподвале28722 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		
		System.out.println(str.charAt(0) != str.charAt(str.length()-1) ? "Win" : "Lose");
		br.close();
	}
}