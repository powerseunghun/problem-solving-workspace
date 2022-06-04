package Acmicpc.As.B3.FourThousandth.Nine;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class WalkLikeAnEgyptian4922 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int n = 0;
		
		while (true) {
			n = Integer.parseInt(br.readLine());
			if (n == 0) break;
			
			sb.append(n + " => " + (int)((Math.pow(n, 2)-(n-1))) + "\n");
		}
		
		System.out.print(sb.toString());
		br.close();
	}
}
