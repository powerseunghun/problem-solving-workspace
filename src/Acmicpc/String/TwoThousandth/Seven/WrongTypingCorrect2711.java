package Acmicpc.String.TwoThousandth.Seven;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class WrongTypingCorrect2711 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine()), wt = 0;
		String tmp = null;
		StringBuilder sb = null, print = new StringBuilder();
		
		for (int i = 0; i < T; i++) {
			tmp = br.readLine();
			wt = Integer.parseInt(tmp.split(" ")[0]);
			sb = new StringBuilder(tmp.split(" ")[1]);
			sb.deleteCharAt(wt-1);
			print.append(sb.toString()+"\n");
		}
		System.out.print(print.toString());
	}
}
