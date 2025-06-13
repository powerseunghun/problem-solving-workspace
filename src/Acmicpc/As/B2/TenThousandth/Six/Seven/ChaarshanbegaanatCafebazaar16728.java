package Acmicpc.As.B2.TenThousandth.Six.Seven;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ChaarshanbegaanatCafebazaar16728 {
	static int func(int x, int y) {
		double v = Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2));
		for (int i = 0; i < 10; i++) {
			if (v <= 10 + 20 * i) return 10-i;
		}
		return 0;
	}
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine()), res = 0, x = 0, y = 0;
		String str = null;
		
		while(N-- > 0) {
			str = br.readLine();
			x = Integer.parseInt(str.split(" ")[0]);
			y = Integer.parseInt(str.split(" ")[1]);
			res += func(x, y);
		}
		
		System.out.println(res);
		br.close();
	}
}
