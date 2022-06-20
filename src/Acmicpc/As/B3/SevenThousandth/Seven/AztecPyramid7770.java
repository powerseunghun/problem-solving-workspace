package Acmicpc.As.B3.SevenThousandth.Seven;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class AztecPyramid7770 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine()), b = 0, res = 0;
		
		while (b <= n) {
			b += Math.pow(res, 2) + Math.pow(res+1, 2);
			res++;
		}
		
		System.out.println(res-1);
		br.close();
	}
}