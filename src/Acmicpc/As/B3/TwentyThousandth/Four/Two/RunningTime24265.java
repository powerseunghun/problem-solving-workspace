package Acmicpc.As.B3.TwentyThousandth.Four.Two;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class RunningTime24265 {
	// N * (N - 1) / 2  
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		long N = Integer.parseInt(br.readLine());
		
		System.out.println(N * (N-1) / 2);
		System.out.println(2);
		br.close();
	}
}
