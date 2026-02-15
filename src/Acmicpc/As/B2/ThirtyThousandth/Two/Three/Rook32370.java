package Acmicpc.As.B2.ThirtyThousandth.Two.Three;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Rook32370 {
	static int func(int a, int b, int x, int y) {
		if (a != 0 && b != 0) {
			return 2;
		} else if ((a == 0 && x == 0 && y < b) || (b == 0 && y == 0 && x < a)) {
			return 3;
		} else return 1;
	}
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		int a = Integer.parseInt(str.split(" ")[0]);
		int b = Integer.parseInt(str.split(" ")[1]);
		str = br.readLine();
		int x = Integer.parseInt(str.split(" ")[0]);
		int y = Integer.parseInt(str.split(" ")[1]);
		
		System.out.println(func(a, b, x, y));
		br.close();
	}
}
