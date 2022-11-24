package Acmicpc.As.B3.TwentyThousandth.Five.Eight;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ChangingStrings25813 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		String str = br.readLine();
		int uIdx = str.indexOf('U'), fIdx = str.lastIndexOf('F');
		
		for (int i = 0; i < uIdx; i++) {
			sb.append("-");
		}
		sb.append("U");
		for (int i = uIdx; i < fIdx-1; i++) {
			sb.append("C");
		}
		sb.append("F");
		for (int i = fIdx; i < str.length()-1; i++) {
			sb.append("-");
		}
		
		System.out.println(sb.toString());
		br.close();
	}
}
