package Acmicpc.String.TwoThousandth.Seven;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class StudyAbroadProhibition2789 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s = br.readLine();
		StringBuilder sb = new StringBuilder();
		
		for (int i = 0; i < s.length(); i++) {
			switch(s.charAt(i)) {
			case 'C': case 'A': case 'M': case 'B': case 'R':
			case 'I': case 'D': case 'G': case 'E':
				continue;
			default:
				sb.append(s.charAt(i));
			}
		}
		System.out.println(sb.toString());
	}
}
