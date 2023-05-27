package Acmicpc.As.B2.NineThousandth.Three;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Palindrome10174 {
	static boolean check(String str) {
		int lIdx = 0, rIdx = str.length()-1;
		while (lIdx < rIdx) {
			if (str.charAt(lIdx) != str.charAt(rIdx)) return false; 
			lIdx++;
			rIdx--;
		}
		
		return true;
	}
	public static void main(String[] args) throws NumberFormatException, IOException {
		StringBuilder sb = new StringBuilder();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		String str = null;
		
		while(N-- > 0) {
			str = br.readLine().toUpperCase();
			sb.append(check(str) ? "Yes" : "No").append("\n");
		}
		
		System.out.print(sb.toString());
		br.close();
	}
}
