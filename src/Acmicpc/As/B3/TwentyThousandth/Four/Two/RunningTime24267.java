package Acmicpc.As.B3.TwentyThousandth.Four.Two;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class RunningTime24267 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		long N = Integer.parseInt(br.readLine());
		
		System.out.println(((N-2)*(N-1)*N) / 6);
		System.out.println(3);
		br.close();
	}
}
