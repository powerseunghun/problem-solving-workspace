package Acmicpc.As.B2.NineThousandth.Eight;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Euclid9984 {
	static int GCD(int a, int b) {
		if (a % b == 0) return b;
		else return GCD(b%a, a);
	}
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		int A = Integer.parseInt(str.split(" ")[0]);
		int B = Integer.parseInt(str.split(" ")[1]);
		
		System.out.println(GCD(A, B));
		br.close();
	}
}
