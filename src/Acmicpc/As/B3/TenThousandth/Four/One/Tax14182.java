package Acmicpc.As.B3.TenThousandth.Four.One;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Tax14182 {
	static int getTax(int e) {
		if (e <= 1000000) return e;
		else if (e <= 5000000) return e - e/10;
		else return e - (e/10*2);
	}
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int e = 0;
		
		while (true) {
			e = Integer.parseInt(br.readLine());
			if (e == 0) break;
			sb.append(getTax(e) + "\n");
		}
		
		System.out.print(sb.toString());
		br.close();
	}
}
