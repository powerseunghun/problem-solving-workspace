package Acmicpc.As.B3.TwentyThousandth.Four.Two;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ЛИНИЯ24296 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		
		while(N%2 != 0) {
			N = (N+1)/2;
		}
		
		System.out.println(N);
		br.close();
	}
}
