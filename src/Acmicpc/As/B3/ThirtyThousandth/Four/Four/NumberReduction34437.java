package Acmicpc.As.B3.ThirtyThousandth.Four.Four;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class NumberReduction34437 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine()), res = 0;
		
		while(N > 1) {
			if ((N&1) != 0) {
				N = N*3+1;
			} else {
				N >>= 1;
			}
			res++;
		}
		
		System.out.println(res);
		br.close();
	}
}
