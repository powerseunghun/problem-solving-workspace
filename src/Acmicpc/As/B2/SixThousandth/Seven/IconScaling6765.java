package Acmicpc.As.B2.SixThousandth.Seven;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class IconScaling6765 {
	static String[] strs = {"*x*", " xx", "* *"};
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int K = Integer.parseInt(br.readLine());
		
		for (int i = 0; i < strs.length; i++) {
			for (int j = 0; j < K; j++) {
				for (int k = 0; k < strs[i].length(); k++) {
					for (int l = 0; l < K; l++) {
						sb.append(strs[i].charAt(k));
					}
				}
				sb.append("\n");
			}
		}
		
		System.out.print(sb.toString());
		br.close();
	}
}
