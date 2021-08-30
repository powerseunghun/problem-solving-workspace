package SWExpertAcademy.TwoThousandth.Zero;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class AlphabetToNumber2050 {
	public static void main(String[] args) throws IOException {
		BufferedReader  br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		String tmp = br.readLine();
		int n = 0;
		
		for (int i = 0; i < tmp.length(); i++) {
			n = tmp.charAt(i) - 64;
			sb.append(n + " ");
		}
		System.out.println(sb.toString());
	}
}
