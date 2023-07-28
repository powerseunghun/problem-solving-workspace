package Acmicpc.As.B2.TwentyThousandth.Four.Six;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class AverageCharacter24608 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		int r = 0;
		
		for (int i = 0; i < str.length(); i++) {
			r += str.charAt(i);
		}
		
		System.out.println((char)(r / str.length()));
		br.close();
	}
}
