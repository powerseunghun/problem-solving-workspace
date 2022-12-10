package Acmicpc.As.B2.Thousandth.Five;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Bird1568 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine()), k = 1, res = 0;
		
		while (N != 0) {
			res++;
			k = N < k ? 1 : k;
			N -= k;
			k++;
		}
		
		System.out.println(res);
		br.close();
	}
}
