package Acmicpc.As.S5.TenThousandth.One.Nine;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MilkPails11999 {
	static final int limit = 1000;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		int x = Integer.parseInt(str.split(" ")[0]);
		int y = Integer.parseInt(str.split(" ")[1]);
		int m = Integer.parseInt(str.split(" ")[2]), res = Integer.MIN_VALUE;
		
		for (int i = 0; i <= limit; i++) {
			for (int j = 0, v = 0; j <= limit; j++) {
				v = i*x + j*y;
				res = v <= m ? Math.max(res, v) : res;
			}
		}
		
		System.out.println(res);
		br.close();
	}
}
