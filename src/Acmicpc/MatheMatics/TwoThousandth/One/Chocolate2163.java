package Acmicpc.MatheMatics.TwoThousandth.One;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Chocolate2163 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String tmp = br.readLine();
		int N = Integer.parseInt(tmp.split(" ")[0]);
		int M = Integer.parseInt(tmp.split(" ")[1]);
		
		System.out.println(N * M-1);
	}
}
