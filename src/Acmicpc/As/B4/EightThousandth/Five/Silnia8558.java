package Acmicpc.As.B4.EightThousandth.Five;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Silnia8558 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine()), res = 1;
		
		for (int i = 2; i <= n; i++) {
			res = (res * i) % 10;
		}
		
		System.out.println(res);
		br.close();
	}
}
