package Acmicpc.As.B5.ThirtyThousandth.Four.Three;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Above34362 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		double N = Double.parseDouble(br.readLine());
		
		System.out.println(N-((double)3/10));
		br.close();
	}
}
