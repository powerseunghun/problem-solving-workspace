package Acmicpc.As.B1.TenThousandth.Seven.Two;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class IamGroot17283 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int L = Integer.parseInt(br.readLine());
		int R = Integer.parseInt(br.readLine()), res = 0, s = 2, c = L;
		
		while(true) {
			c *= (double)R / 100.0;
			if (c <= 5) break;
			res += s * c;
			s *= 2;
		}
		
		System.out.println(res);
		br.close();
	}
}
