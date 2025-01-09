package Acmicpc.As.B3.TwentyThousandth.Five.Six;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class SotteokSotteok25641 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		br.readLine();
		String str = br.readLine();
		int sc = 0, tc = 0;
		
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == 's') sc++;
			else tc++;
		}
		
		for (int i = 0; i < str.length(); i++) {
			if (sc == tc) {
				sb.append(str.substring(i));
				break;
			} 
			else if (str.charAt(i) == 's') sc--;
			else if (str.charAt(i) == 't') tc--;
		}
		
		System.out.print(sb.toString());
		br.close();
	}
}
