package Acmicpc.As.B4.ThirtyThousandth.One.Two;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class НАМИСЛИХСИЧИСЛО31261 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		int a = Integer.parseInt(str.split(" ")[0]);
		int b = Integer.parseInt(str.split(" ")[1]);
		int c = (a*b + (int)Math.pow(a, 2)) + a;
		
		System.out.println(c * a);
		br.close();
	}
}
