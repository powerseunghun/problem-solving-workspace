package Acmicpc.As.S5.NineThousandth.Three;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class RealMessage9324 {
	static final int dupLimit = 3;
	static int[] arr = null;
	static boolean check(String str) {
		arr = new int[27];
		char c = ' ';
		for (int i = 0; i < str.length(); i++) {
			c = str.charAt(i);
			arr[c-65]++;
			
			if (arr[c-65] == dupLimit) {
				// String end | !=
				if (i == str.length()-1 || c != str.charAt((i++)+1)) return false;
				arr[c-65] = 0;
			}
		}
		return true;
	}
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int T = Integer.parseInt(br.readLine());
		String str = null;
		
		while(T-- > 0) {
			str = br.readLine();
			sb.append(check(str) ? "OK" :"FAKE").append("\n");
		}
		
		System.out.print(sb.toString());
		br.close();
	}
}
