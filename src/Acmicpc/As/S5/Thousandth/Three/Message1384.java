package Acmicpc.As.S5.Thousandth.Three;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Message1384 {
	static String[] names = null;
	static String[] msgs = null;
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		String str = null;
		int g = 1, N = 0;
		boolean flag = false;
		
		while(true) {
			N = Integer.parseInt(br.readLine());
			if (N == 0) break;
			
			names = new String[N];
			msgs = new String[N];
			flag = true;
			
			if (g > 1) {
				sb.append("\n");
			}
			Arrays.fill(msgs, "");
			for (int i = 0; i < N; i++) {
				str = br.readLine();
				names[i] = str.split(" ")[0];
				for (int j = 1; j < str.split(" ").length; j++) {
					msgs[i] += str.split(" ")[j];
					if (msgs[i].indexOf('N') >= 0) {
						flag = false;
					}
				}
			}
			
			sb.append("Group ").append(g++).append("\n");
			if (flag) {
				sb.append("Nobody was nasty").append("\n");
				continue;
			}
			
			for (int i = 0; i < msgs.length; i++) {
				str = msgs[i];
				for (int j = 0, idx = 0; j < str.length(); j++) {
					char c = str.charAt(j);
					if (c == 'N') {
						idx = i-j-1;
						idx = idx < 0 ? idx + N : idx;
						sb.append(names[idx]).append(" was nasty about ").append(names[i]).append("\n");
					}
				}
			}
		}
		
		System.out.print(sb.toString());
		br.close();
	}
}
