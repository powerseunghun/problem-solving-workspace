package Goorm.AlgorithmHeroes.T6;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class NewEncryption {
	static long func(long n) {
		if (n % 4 == 0) return n;
		else if (n%4 == 1) return 1;
		else if (n%4 == 2) return n+1;
		return 0;
	}
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String tmp = br.readLine();
		long A = Long.parseLong(tmp.split(" ")[0]);
		long B = Long.parseLong(tmp.split(" ")[1]);
		
		System.out.println(func(A-1)^func(B));
	}
}
