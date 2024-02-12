package Acmicpc.As.B5.ThirtyThousandth.Zero.Zero;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class LuckSeven30224 {
	static String func(String str) {
		int N = Integer.parseInt(str);
		return str.contains("7") ? N % 7 == 0 ? "3" : "2" : N % 7 == 0 ? "1" : "0";
	}
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		
		System.out.println(func(str));
		br.close();
	}
}
