package Acmicpc.As.B2.TenThousandth.Four.Seven;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class DiscreteMathematics14723 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine()), a = 1, b = 2;
		
		while(a < N) {
			a += b++;
		}
		
		System.out.println(a-N+1 + " " + (b-a+N-1));
		br.close();
	}
}
