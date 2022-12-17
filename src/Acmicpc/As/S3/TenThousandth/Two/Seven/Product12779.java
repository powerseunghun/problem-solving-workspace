package Acmicpc.As.S3.TenThousandth.Two.Seven;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Product12779 {
	static long GCD(long A, long B) {
		if (B == 0) return A;
		else return GCD(B, A%B);
	}
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String tmp = br.readLine();
		long A = Long.parseLong(tmp.split(" ")[0]);
		long B = Long.parseLong(tmp.split(" ")[1]), D = 0;
		int C = 0;

		C = (int)(Math.sqrt(B)) - (int)(Math.sqrt(A));
		
		if (C == 0) {
			System.out.println("0");
		}
		else {
			D = GCD(C, B-A);
			System.out.println(C/D + "/" + (B-A)/D);
		}
	}
}
