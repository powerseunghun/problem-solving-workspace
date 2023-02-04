package Acmicpc.As.B2.TwoThousandth.Seven;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BinaryClock2704 {
	static String func(String tmp) {
		String[] strs = new String[3], tmps = tmp.split(":");
		StringBuilder sb = new StringBuilder();
		for (int i = 0, v = 0; i < tmps.length; i++) {
			v = Integer.parseInt(tmps[i]);
			strs[i] = String.format("%06d", Integer.parseInt(Integer.toBinaryString(v)));
		}
		for (int i = 0; i < strs[0].length(); i++) {
			for (int j = 0; j < strs.length; j++) {
				sb.append(strs[j].charAt(i));
			}
		}
		sb.append(" ");
		for (int i = 0; i < strs.length; i++) {
			for (int j = 0; j < strs[i].length(); j++) {
				sb.append(strs[i].charAt(j));
			}
		}
		return sb.toString();
	}
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int T = Integer.parseInt(br.readLine());
		String tmp = null;
		
		
		while(T-- > 0) {
			tmp = br.readLine();
			sb.append(func(tmp) + "\n");
		}
		
		System.out.print(sb.toString());
		br.close();
	}
}
