package Acmicpc.As.B3.TwentyThousandth.Six.Three;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Basket26360 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int x = Integer.parseInt(br.readLine());
		int a = Integer.parseInt(br.readLine());
		int b = Integer.parseInt(br.readLine()), c = 0, res = 0;
		
		if (a == 1) res = x;
		if (b == 1) {
			c = a==1 ? 1:x;
			while(c-- > 0) {
				if (Integer.parseInt(br.readLine()) == 1) res++;
			}
		}
		
		System.out.println(res);
		br.close();
	}
}
