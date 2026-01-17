package Acmicpc.As.B3.ThirtyThousandth.One.Two;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class СИМЕТРИЧНИЧИСЛА31244 {
	static String func(int n, int t, int h) {
		if (n == h) {
			return "";
		}
		return t != h ? String.valueOf(t) + String.valueOf(n) : String.valueOf(n);
	}
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		int n = Integer.parseInt(str.split(" ")[0]);
		int t = Integer.parseInt(str.split(" ")[1]);
		int h = Integer.parseInt(str.split(" ")[2]);
		
		System.out.print(n);
		System.out.print(t);
		System.out.print(h);
		System.out.println(func(n, t, h));
		br.close();
	}
}
