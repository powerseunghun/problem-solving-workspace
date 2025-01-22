package Acmicpc.As.B2.TenThousandth.Six.Seven;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MixingMilk16769 {
	static final int l = 3;
	static int[] c = new int[l], m = new int[l];
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		String str = null;
		
		for (int i = 0; i < l; i++ ) {
			str = br.readLine();
			c[i] = Integer.parseInt(str.split(" ")[0]);
			m[i] = Integer.parseInt(str.split(" ")[1]);
		}
		
		for (int i = 0; i < 100; i++) {
			m[(i+1)%3] += m[i%3];
			if (m[(i+1)%3] > c[(i+1)%3]) {
				m[i%3] = m[(i+1)%3]-c[(i+1)%3];
				m[(i+1)%3] = c[(i+1)%3];
			} else {
				m[i%3] = 0;
			}
		}
		for (int el : m) {
			sb.append(el).append("\n");
		}
		
		System.out.print(sb.toString());
		br.close();
	}
}
