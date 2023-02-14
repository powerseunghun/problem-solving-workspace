package Acmicpc.As.B2.ThreeThousandth;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class AddingReversedNumbers3486 {
	static int func(String tmp) {
		StringBuilder sb1 = new StringBuilder(tmp.split(" ")[0]);
		StringBuilder sb2 = new StringBuilder(tmp.split(" ")[1]);
		int res = Integer.parseInt(sb1.reverse().toString()) + Integer.parseInt(sb2.reverse().toString());
		sb1 = new StringBuilder(res+"");
		
		return Integer.parseInt(sb1.reverse().toString());
	}
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int N = Integer.parseInt(br.readLine());
		String tmp = null;
		
		while(N-- > 0) {
			tmp = br.readLine();
			sb.append(func(tmp) + "\n");
		}
		
		System.out.print(sb.toString());
		br.close();
	}
}
