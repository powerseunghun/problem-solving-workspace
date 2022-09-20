package Acmicpc.As.B3.TwentyThousandth.Five.Five;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PuangJongYun25591 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String tmp = br.readLine();
		int a = 100-Integer.parseInt(tmp.split(" ")[0]);
		int b = 100-Integer.parseInt(tmp.split(" ")[1]);
		int c = 100-(a+b);
		int d = a*b;
		int q = d/100;
		int r = d%100;
		
		System.out.println(a + " " + b + " " + c + " " + d + " " + q + " " + r);
		System.out.println((c+q) + " " + r);
		br.close();
	}
}
