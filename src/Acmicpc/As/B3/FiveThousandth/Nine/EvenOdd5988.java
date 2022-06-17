package Acmicpc.As.B3.FiveThousandth.Nine;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class EvenOdd5988 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		StringBuilder sb = new StringBuilder();
		String tmp = null;
		
		for (int i = 0; i < N; i++) {
			tmp = br.readLine();
			sb.append((tmp.charAt(tmp.length()-1)-'0') % 2 == 0 ? "even\n" : "odd\n");
		}
		
		System.out.print(sb.toString());
		br.close();
	}
}
