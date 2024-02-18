package Acmicpc.As.B5.TwentyThousandth.Seven.Two;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class РобинзонКрузо27219 {
	static final int base = 5;
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int N = Integer.parseInt(br.readLine());
		
		for (int i = 0; i < N/base; i++) {
			sb.append("V");
		}
		for (int i = 0; i < N%base; i++) {
			sb.append("I");
		}
		
		System.out.println(sb.toString());
		br.close();
	}
}
