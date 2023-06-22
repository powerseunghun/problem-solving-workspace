package Acmicpc.As.B2.TenThousandth.Seven.Two;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Bottle17293 {
	static String format1(int i, int f) {
		return (i == 0 ? (f == 0 ? "No more" : "no more") : i) + " bottle" + (i == 1 ? " " : "s ") 
				+ "of beer";
	}
	static String format2(int i, int f, int w) {
		return (w == 0 ? format1(i, 0) : format1(i, 1)) + " on the wall" + (f == 0 ? ", " : ".\n");
	}
	static String format3(int i) {
		return (i+1) == 0 
				? "Go to the store and buy some more, " 
				: "Take one down and pass it around, ";
	}
	static String func(int N) {
		StringBuilder sb = new StringBuilder();
		int v = N;
		for (int i = N; i >= 0;) {
			sb.append(format2(i, 0, 0));
			sb.append(format1(i, 1)).append(".\n");
			i--;
			sb.append(format3(i));
			sb.append(format2(i < 0 ? N : i, 1, 1));
			if (i >= 0) sb.append("\n");
		}
		
		return sb.toString();
	}
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		
		System.out.println(func(N));
		br.close();
	}
}
