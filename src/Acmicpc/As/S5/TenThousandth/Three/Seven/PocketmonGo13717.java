package Acmicpc.As.S5.TenThousandth.Three.Seven;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PocketmonGo13717 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine()), k = 0, m = 0, c = 0, cSum = 0, max = Integer.MIN_VALUE;
		String name = null, res = null, str = null;
		
		while(N-- > 0) {
			name = br.readLine();
			str = br.readLine();
			c = 0;
			k = Integer.parseInt(str.split(" ")[0]);
			m = Integer.parseInt(str.split(" ")[1]);
			
			while(k <= m) {
				int t = m/k;
				c += t;
				m %= k;
				m += t*2;
			}
			cSum += c;
			if (max < c) {
				max = c;
				res = name;
			}
		}
		
		System.out.println(cSum);
		System.out.println(res);
		br.close();
	}
}
