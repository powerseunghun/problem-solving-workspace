package Acmicpc.As.B4.ThirtyThousandth.Zero.Zero;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ChesseBurger30017 {
	static final int base = 3;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		int A = Integer.parseInt(str.split(" ")[0]) - 2;
		int B = Integer.parseInt(str.split(" ")[1]) - 1;
		
		System.out.println(base + Math.min(A, B) * 2);
		br.close();
	}
}
