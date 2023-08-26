package Acmicpc.As.B1.TwoThousandth.Two;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Dobi2204 {
	static String[] strs = null;
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		String str = null, res = null;
		int N = 0;
		
		while(true) {
			N = Integer.parseInt(br.readLine());
			if (N == 0) break;
			res = null;
			strs = new String[N];
			for (int i = 0; i < strs.length; i++) {
				strs[i] = br.readLine();
				str = strs[i].toUpperCase();
				res = res == null ? str : str.compareTo(res) > 0 ? res : str;
			}
			for (String kStr : strs) {
				if (kStr.toUpperCase().equals(res)) {
					res = kStr;
					break;
				}
			}
			
			sb.append(res).append("\n");
		}
		
		System.out.print(sb.toString());
		br.close();
	}
}
