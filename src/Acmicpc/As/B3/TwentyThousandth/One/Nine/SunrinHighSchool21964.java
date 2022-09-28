package Acmicpc.As.B3.TwentyThousandth.One.Nine;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SunrinHighSchool21964 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		br.readLine();
		String str = br.readLine();
		
		System.out.println(str.substring(str.length()-5, str.length()));
		br.close();
	}
}
