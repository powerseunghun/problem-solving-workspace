package Acmicpc.OrderSubmit.ThreeThousandth.Four;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BinaryNumber3460 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		String tmp = null;
		int T = Integer.parseInt(br.readLine());
		
		for (int i = 0; i < T; i++) {
			tmp = Integer.toBinaryString(Integer.parseInt(br.readLine()));
			for (int j = tmp.length()-1, idx = 0; j >= 0; j--, idx++) {
				if (tmp.charAt(j) == '1') {
					sb.append(idx + " ");
				}
			}
			sb.append("\n");
		}
		
		System.out.println(sb.toString());
		br.close();
	}
}
