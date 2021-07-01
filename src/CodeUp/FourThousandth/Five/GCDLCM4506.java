package CodeUp.FourThousandth.Five;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class GCDLCM4506 {
	static int GCD(int a, int b) {
		if (b % a == 0) return a;
		else return GCD(b % a, a);
	}
	static int LCM(int a, int b) {
		return a * b / GCD(a, b);
	}
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String tmp = br.readLine();
		int a = Integer.parseInt(tmp.split(" ")[0]);
		int b = Integer.parseInt(tmp.split(" ")[1]);
		
		System.out.println(GCD(a, b));
		System.out.println(LCM(a, b));
	}
}
