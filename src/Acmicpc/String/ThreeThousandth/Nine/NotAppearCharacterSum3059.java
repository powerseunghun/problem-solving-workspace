package Acmicpc.String.ThreeThousandth.Nine;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class NotAppearCharacterSum3059 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine()), sum = 0;
		int[] alphaCount = new int[26];
		String tmp = null;
		StringBuilder sb = new StringBuilder();
		
		for (int i = 0; i < T; i++) {
			tmp = br.readLine();
			sum = 0;
			Arrays.fill(alphaCount, 0);
			for (int j = 0; j < tmp.length(); j++) {
				alphaCount[tmp.charAt(j)-'A']++;
			}
			for (int j = 0; j < alphaCount.length; j++) {
				if (alphaCount[j] == 0) sum += (j+65);
 			}
			sb.append(sum+"\n");
		}
		System.out.print(sb.toString());
	}
}
