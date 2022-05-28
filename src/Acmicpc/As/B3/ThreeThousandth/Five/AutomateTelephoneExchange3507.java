package Acmicpc.As.B3.ThreeThousandth.Five;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class AutomateTelephoneExchange3507 {
	static final int lv = 100;
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine()), res = 0;
		
		for (int i = 0; i < lv; i++) {
			for (int j = 0; j < lv; j++) {
				res += i + j == N ? 1 : 0;
			}
		}
		
		System.out.println(res);
		br.close();
	}
}
