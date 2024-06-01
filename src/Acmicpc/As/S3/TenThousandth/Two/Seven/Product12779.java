package Acmicpc.As.S3.TenThousandth.Two.Seven;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Product12779 {
	static long GCD(long A, long B) {
		if (B == 0L) return A;
		else return GCD(B, A%B);
	}
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String tmp = br.readLine();
		long A = Long.parseLong(tmp.split(" ")[0]);
		long B = Long.parseLong(tmp.split(" ")[1]);
		long C = 0, D = 0;

		for (long i = (long)(Math.sqrt(A)); i*i <= B; i++) {
			C = i*i > A ? 1 : 0;
		}
	
		if (C == 0L) {
			System.out.println("0");
		}
		else {
			D = GCD(B-A, C);
			System.out.println((C/D) + "/" + ((B-A)/D));
		}
	}
}
