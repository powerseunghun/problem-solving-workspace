package Acmicpc.As.B3.ThirtyThousandth.Two.Five;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BB32515 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int n = Integer.parseInt(br.readLine());
		String a = br.readLine();
		String b = br.readLine();
		String c = br.readLine();
		String d = br.readLine();
		
		for (int i = 0; i < n; i++) {
			if (a.charAt(i) != c.charAt(i)) continue;
			if (b.charAt(i) != d.charAt(i)) {
				sb = new StringBuilder("htg!");
				break;
			}
			sb.append(b.charAt(i));
		}
		
		System.out.println(sb.toString());
		br.close();
	}
}
