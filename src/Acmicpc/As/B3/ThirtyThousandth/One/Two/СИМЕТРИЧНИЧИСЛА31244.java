package Acmicpc.As.B3.ThirtyThousandth.One.Two;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class СИМЕТРИЧНИЧИСЛА31244 {
	static void func(int n, int t, int h) {
		System.out.print(n);
		System.out.print(t);
		System.out.print(h);
		if (n == h) {
			return;
		}
		if (t != h) {
			System.out.print(t);
		}
		System.out.println(n);
	}
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		int n = Integer.parseInt(str.split(" ")[0]);
		int t = Integer.parseInt(str.split(" ")[1]);
		int h = Integer.parseInt(str.split(" ")[2]);
		
		func(n, t, h);
		br.close();
	}
}
