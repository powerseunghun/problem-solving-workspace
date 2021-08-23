package Acmicpc.NumberTheory.Thousandth.Seven;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FractionSum1735 {
	static int GCD(int a, int b) {
		if (b == 0) return a;
		else return GCD(b, a%b);
	}
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String tmp = br.readLine();
		int a = Integer.parseInt(tmp.split(" ")[0]);
		int b = Integer.parseInt(tmp.split(" ")[1]);
		tmp = br.readLine();
		int c = Integer.parseInt(tmp.split(" ")[0]);
		int d = Integer.parseInt(tmp.split(" ")[1]);
		
		a *= d; c *= b;
		a += c; b *= d;
		System.out.println(a/GCD(a,b) + " " + b/GCD(a,b));
	}
}
