package Goorm.Level2;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class EuclideanAlgorithm {
	static int gcd(int a, int b) {
		if (b == 0) return a;
		else return gcd(b, a%b);
	}
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String tmp = br.readLine();
		int a = Integer.parseInt(tmp.split(" ")[0]);
		int b = Integer.parseInt(tmp.split(" ")[1]);
		
		System.out.println(gcd(a, b));
	}
}
