package Acmicpc.As.B4.ThirtyThousandth.One.Zero;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class WhatSpecial31090 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int T = Integer.parseInt(br.readLine());
		String str = null;
		
		while(T-- > 0) {
			str = br.readLine();
			int N = Integer.parseInt(str)+1;
			
			sb.append(N % (Integer.parseInt(str.substring(2, str.length()))) == 0 ? "Good" : "Bye").append("\n");
		}
		
		System.out.print(sb.toString());
		br.close();
	}
}
