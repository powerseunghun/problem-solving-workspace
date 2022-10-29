package Acmicpc.As.B3.NineThousandth.Three;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PracticeRollCall9308 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		String first = null, last = null;
		int N = Integer.parseInt(br.readLine());
		
		for (int i = 1; i <= N; i++) {
			last = br.readLine();
			first = br.readLine();
			sb.append("Case " + i + ": " + first + ", " + last + "\n");
		}
		
		System.out.print(sb.toString());
		br.close();
	}
}
