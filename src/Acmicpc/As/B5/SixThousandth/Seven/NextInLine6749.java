package Acmicpc.As.B5.SixThousandth.Seven;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class NextInLine6749 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int X = Integer.parseInt(br.readLine());
		int Y = Integer.parseInt(br.readLine());
		
		System.out.println(Math.max(X, Y) + Math.abs(X-Y));
		br.close();
	}
}
