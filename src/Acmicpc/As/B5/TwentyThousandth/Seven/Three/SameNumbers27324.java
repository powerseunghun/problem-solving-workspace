package Acmicpc.As.B5.TwentyThousandth.Seven.Three;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class SameNumbers27324 {
	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		
		System.out.println(str.charAt(0) == str.charAt(1) ? "1" : "0");
		br.close();
	}
}
