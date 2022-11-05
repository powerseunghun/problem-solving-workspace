package Acmicpc.As.B3.TwentyThousandth.Zero.Six;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Statistics20674 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine()), sum = 0, p = 0, w = Integer.parseInt(br.readLine());
		
		while(T-- > 1) {
			p = Integer.parseInt(br.readLine());
			if (p > w) {
				sum += p-w;
			}
			else {
				w = p;
			}
		}
		
		System.out.println(sum);
		br.close();
	}
}
