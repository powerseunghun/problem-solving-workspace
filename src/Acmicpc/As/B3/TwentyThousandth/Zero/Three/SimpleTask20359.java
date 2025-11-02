package Acmicpc.As.B3.TwentyThousandth.Zero.Three;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SimpleTask20359 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine()), o = n, p = 0;
		
		while ((o&1) == 0) {
			o >>= 1;
			p++;
		}
		
		System.out.println(o + " " + p);
		br.close();
	}
}
