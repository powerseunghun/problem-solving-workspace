package Acmicpc.As.B3.ThirtyThousandth.Two.Seven;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class IntuitiveElements32795 {
	static boolean func(String a, String b) {
		boolean flag = true;
		for (int i = 0; i < b.length(); i++) {
			if (a.indexOf(b.charAt(i)) < 0) {
				flag = false;
			}
		}
		return flag;
	}
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int N = Integer.parseInt(br.readLine());
		
		while(N-- > 0) {
			sb.append(func(br.readLine(), br.readLine()) ? "YES" : "NO").append("\n");
		}
		
		System.out.print(sb.toString());
		br.close();
	}
}
