package Acmicpc.String.NineThousandth.Zero;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class String9086 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		String tmp = null;
		StringBuilder sb = new StringBuilder();
		
		for (int i = 0; i < T; i++) {
			tmp = br.readLine();
			sb.append(tmp.charAt(0));
			sb.append(tmp.charAt(tmp.length()-1) + "\n");
		}
		
		System.out.println(sb.toString());
	}
}
