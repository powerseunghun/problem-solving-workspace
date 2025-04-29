package Acmicpc.As.B2.TwentyThousandth.Five.Seven;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class NumberMaximization25773 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		char[] cs = br.readLine().toCharArray();
		Arrays.sort(cs);
		
		for (int i = cs.length-1; i >= 0; i--) {
			sb.append(cs[i]);
		}
		
		System.out.println(Integer.parseInt(sb.toString()));
		br.close();
	}
}
