package Acmicpc.As.B3.ThirtyThousandth.One.Five;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ClockTower31561 {
	static String func(int M) {
		int f = M < 30? M/2 : 15+(M-30)*3/2;
		return f + "." + (M&1)*5;
	}
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int M = Integer.parseInt(br.readLine());
		
		System.out.println(func(M));
		br.close();
	}
}
