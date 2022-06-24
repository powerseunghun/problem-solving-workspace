package Acmicpc.As.B3.EightThousandth.Eight;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Test8815 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int z = Integer.parseInt(br.readLine()), n = 0;
		// BCBCDCDADABA;
		String base = "BCBCDCDADABA";
		
		while (z-- > 0) {
			n = Integer.parseInt(br.readLine());
			sb.append(n==1 ? "A" : base.charAt((n-2)%12));
			sb.append("\n");
		}
		System.out.print(sb.toString());
		br.close();
	}
}
