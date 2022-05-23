package Codeforce.OrderSubmit.OneThousandth.SixHundred;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class RaisingBacteria {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		long x = Long.parseLong(br.readLine()), cnt = 0;
		
		while (x/2 != 0) {
			cnt += x%2 == 0 ? 0 : 1;
			x /= 2;
		}
		cnt++;
		
		System.out.println(cnt);
		br.close();
	}
}