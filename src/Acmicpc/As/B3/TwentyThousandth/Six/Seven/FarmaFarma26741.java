package Acmicpc.As.B3.TwentyThousandth.Six.Seven;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FarmaFarma26741 {
//	static int gcd(int a, int b) {
//		if (b == 0) return a;
//		else return gcd(b, a % b);
//	}
//	static int lcm(int a, int b) {
//		return a * b / gcd(a, b);
//	}
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		int X = Integer.parseInt(str.split(" ")[0]) * 2;
		int Y = Integer.parseInt(str.split(" ")[1]);
		
		System.out.println((X/2-((Y-X) / 2)) + " " + ((Y-X) / 2));
		br.close();
	}
}
