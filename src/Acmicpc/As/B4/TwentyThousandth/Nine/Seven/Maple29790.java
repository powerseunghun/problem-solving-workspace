package Acmicpc.As.B4.TwentyThousandth.Nine.Seven;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Maple29790 {
	static String func(String str) {
		int N = Integer.parseInt(str.split(" ")[0]);
		int U = Integer.parseInt(str.split(" ")[1]);
		int L = Integer.parseInt(str.split(" ")[2]);
		
		if (N < 1000) return "Bad";
		
		return U >= 8000 || L >= 260 ? "Very Good" : "Good";
	}
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		
		System.out.println(func(str));
		br.close();
	}
}
