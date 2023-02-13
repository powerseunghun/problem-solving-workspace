package Acmicpc.As.B2.ThreeThousandth.Seven;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class AnagramDistance3778 {
	static int[] arr1 = new int[27], arr2 = new int[27];
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int N = Integer.parseInt(br.readLine()), res = 0;
		String str1 = null, str2 = null;
		char c = ' ';
		
		for (int i = 1; i <= N; i++) {
			res = 0;
			str1 = br.readLine();
			str2 = br.readLine();
			Arrays.fill(arr1, 0);
			Arrays.fill(arr2, 0);
			for (int j = 0; j < str1.length(); j++) {
				c = str1.charAt(j);
				arr1[c-97]++;
			}
			for (int j = 0; j < str2.length(); j++) {
				c = str2.charAt(j);
				arr2[c-97]++;
			}
			for (int j = 0; j < arr1.length; j++) {
				res += Math.abs(arr1[j]-arr2[j]);
			}
			sb.append("Case #" + i + ": " + res + "\n");
		}
		
		System.out.print(sb.toString());
		br.close();
	}
}
