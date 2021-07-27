package Acmicpc.String.FourThousandth.Four;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class UpperFirstWord4458 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		String tmp = null;
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < N; i++) {
			tmp = br.readLine();
			for (int j = 0; j < tmp.length(); j++) {
				if ((j == 0) && (tmp.charAt(0) >= 'a' && tmp.charAt(0) <= 'z')) {
					sb.append((char)(tmp.charAt(0) - 32));
					continue;
				}
				sb.append(tmp.charAt(j));
			}
			sb.append("\n");
		}
		System.out.print(sb.toString());
	}
}
