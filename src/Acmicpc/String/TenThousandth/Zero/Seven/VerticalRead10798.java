package Acmicpc.String.TenThousandth.Zero.Seven;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class VerticalRead10798 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] strs = new String[5];
		int maxLength = 0;
		for (int i = 0; i < strs.length; i++) {
			strs[i] = br.readLine();
			maxLength = Math.max(maxLength, strs[i].length());
		}
		
		for (int i = 0; i < maxLength; i++) {
			for (int j = 0; j < strs.length; j++) {
				if (i >= strs[j].length()) continue;
				System.out.print(strs[j].charAt(i));
			}
		}
	}
}
