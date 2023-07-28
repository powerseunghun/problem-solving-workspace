package Acmicpc.As.B2.TwentyThousandth.Four.Four;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class EyeOfSauron24405 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		int l = str.indexOf('(');
		int r = str.indexOf(')');
		
		System.out.println(l == str.length()-1-r ? "correct" : "fix");
		
		br.close();
	}
}
