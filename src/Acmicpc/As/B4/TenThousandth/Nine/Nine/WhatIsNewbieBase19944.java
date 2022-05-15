package Acmicpc.As.B4.TenThousandth.Nine.Nine;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class WhatIsNewbieBase19944 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String tmp = br.readLine();
		int N = Integer.parseInt(tmp.split(" ")[0]);
		int M = Integer.parseInt(tmp.split(" ")[1]);
		
		if (M == 1 || M == 2) {
			System.out.println("NEWBIE!");
		}
		else if (M <= N) System.out.println("OLDBIE!");
		else System.out.println("TLE!");
		
		br.close();
	}
}
