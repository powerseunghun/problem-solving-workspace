package Acmicpc.As.B3.ThirtyThousandth.One.Six;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Repetition31613 {
	static final int divide = 3;
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int X = Integer.parseInt(br.readLine()), r = 0;
		int N = Integer.parseInt(br.readLine()), res = 0;
		
		while(X < N) {
			r = X % divide;
			X = r == 0 ? X+1 : r == 1 ? X*2: X*3;
			res++;
		}
		
		System.out.println(res);
		br.close();
	}
}
