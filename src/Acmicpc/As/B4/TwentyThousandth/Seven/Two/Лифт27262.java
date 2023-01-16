package Acmicpc.As.B4.TwentyThousandth.Seven.Two;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Лифт27262 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String tmp = br.readLine();
		int n = Integer.parseInt(tmp.split(" ")[0]);
		int k = Integer.parseInt(tmp.split(" ")[1]);
		int a = Integer.parseInt(tmp.split(" ")[2]);
		int b = Integer.parseInt(tmp.split(" ")[3]);
		int res1 = ((k-1) * b) + ((n-1) * b);
		int res2 = (n-1) * a;
		
		System.out.println(res1 + " " + res2);
		br.close();
	}
}
