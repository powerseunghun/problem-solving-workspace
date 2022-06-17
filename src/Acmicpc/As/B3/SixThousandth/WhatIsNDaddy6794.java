package Acmicpc.As.B3.SixThousandth;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class WhatIsNDaddy6794 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine()), cnt = 0;
		for (int i = 0; i <= 5; i++) {
			for (int j = i; j <= 5; j++) {
				if (i+j == n) cnt++;
			}
		}
		System.out.println(cnt);
		br.close();
	}
}
