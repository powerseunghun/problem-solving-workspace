package Acmicpc.As.B3.TwentyThousandth.Four.Zero;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 次の文字24084 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		br.readLine();
		String tmp = br.readLine();
		
		for (int i = 1; i < tmp.length(); i++) {
			sb.append(tmp.charAt(i) == 'J' ? tmp.charAt(i-1)+"\n" : "");
		}
		
		System.out.print(sb.toString());
		br.close();
	}
}
