package Acmicpc.As.B4.ThirtyThousandth.One.Two;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ЛОВНОКУЧЕ31282 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		int N = Integer.parseInt(str.split(" ")[0]);
		int M = Integer.parseInt(str.split(" ")[1]);
		int K = Integer.parseInt(str.split(" ")[2]);
		
		System.out.println((N+K-M-1)/(K-M));
		br.close();
	}
}
