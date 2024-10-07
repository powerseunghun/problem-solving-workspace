package Acmicpc.As.B3.ThirtyThousandth.Zero.Two;

import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;

public class AgeExpression30215 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		int o = Integer.parseInt(str.split(" ")[0]);
		int a = Integer.parseInt(str.split(" ")[1]);
		int k = Integer.parseInt(str.split(" ")[2]);
		boolean flag = false;
		
		for (int i = 1; i <= o/a && !flag; i++) {
			for (int j = 1; j <= o/k && !flag; j++) {
				flag = a*i+k*j == o;
			}
		}
		
		System.out.println(flag ? "1" : "0");
		br.close();
	}
}
