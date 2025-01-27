package Acmicpc.As.B2.TenThousandth.Four.Six;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Calculate14614 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		int A = Integer.parseInt(str.split(" ")[0]);
		int B = Integer.parseInt(str.split(" ")[1]);
		char c = str.charAt(str.length()-1);
		
		System.out.println((c-'0') % 2 == 0 ? A : A^B);
		br.close();
	}
}
