package Acmicpc.As.B3.TenThousandth.Five.Three;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Aron15354 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine()), cnt = 0;
		char cur = ' ', before = ' ';
		
		while (N-- > 0) {
			cur = br.readLine().charAt(0);
			if (cur == before) continue;
			before = cur;
			cnt++;
		}
		
		System.out.println(cnt+1);
		br.close();
	}
}
