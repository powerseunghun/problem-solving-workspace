package Acmicpc.As.B3.TwentyThousandth.Five.Eight;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class HeavyNumbers25814 {
	static int func(int N) {
		int sum = 0, l = (N+"").length();
		while (N != 0) {
			sum += N%10;
			N /= 10;
		}
		return sum * l;
	}
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String tmp = br.readLine();
		int A = Integer.parseInt(tmp.split(" ")[0]);
		int B = Integer.parseInt(tmp.split(" ")[1]);
		
		A = func(A);
		B = func(B);
		
		System.out.println(A == B ? "0" : A > B ? "1" : "2");
		br.close();
	}
}
