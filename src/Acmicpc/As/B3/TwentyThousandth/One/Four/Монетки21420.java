package Acmicpc.As.B3.TwentyThousandth.One.Four;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Монетки21420 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine()), v = 0, c1 = 0, c2 = 0;
		
		while(N-- > 0) {
			v = Integer.parseInt(br.readLine());
			if (v == 0) {
				c1++;
			}
			else {
				c2++;
			}
		}
		
		System.out.println(Math.min(c1, c2));
		br.close();
	}
}
