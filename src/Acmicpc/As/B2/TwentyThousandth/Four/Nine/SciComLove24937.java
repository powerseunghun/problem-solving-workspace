package Acmicpc.As.B2.TwentyThousandth.Four.Nine;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SciComLove24937 {
	static final String str = "SciComLove";
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine()) % str.length();
		
		System.out.println(str.substring(N, str.length()) + str.substring(0, N));
		br.close();
	}
}
