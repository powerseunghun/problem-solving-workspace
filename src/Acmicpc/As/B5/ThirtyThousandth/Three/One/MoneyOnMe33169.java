package Acmicpc.As.B5.ThirtyThousandth.Three.One;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MoneyOnMe33169 {
	static final int l = 2;
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int res = 0;
		
		for (int i = 1; i <= l; i++) {
			res += (Integer.parseInt(br.readLine()) * Math.pow(10, 2+i));
		}
		
		System.out.println(res);
		br.close();
	}
}
