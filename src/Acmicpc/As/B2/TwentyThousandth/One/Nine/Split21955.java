package Acmicpc.As.B2.TwentyThousandth.One.Nine;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Split21955 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		int m = str.length()/2;
		
		System.out.println(str.substring(0, m) + " " + str.substring(m, str.length()));
		br.close();
	}
}
