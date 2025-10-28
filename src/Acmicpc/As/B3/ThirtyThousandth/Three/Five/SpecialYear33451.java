package Acmicpc.As.B3.ThirtyThousandth.Three.Five;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SpecialYear33451 {
	static boolean func(int X) {
		String str = String.valueOf(X);
		int a = Integer.parseInt(str.substring(0, str.length()/2));
		int b = Integer.parseInt(str.substring(str.length()/2, str.length()));
		
		return Math.pow(a+b, 2) == X;
	}
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int X = Integer.parseInt(br.readLine()), res = 0;
		boolean flag = false;
		
		for (int i = X+1; i <= 9999; i++) {
			if (func(i)) {
				flag = true;
				res = i;
				break;
			}
		}
		
		System.out.println(flag ? res : -1);
		br.close();
	}
}
