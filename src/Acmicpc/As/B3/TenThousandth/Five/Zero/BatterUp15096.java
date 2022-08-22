package Acmicpc.As.B3.TenThousandth.Five.Zero;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BatterUp15096 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine()), sum = 0, t = 0;
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		while (st.hasMoreTokens()) {
			t = Integer.parseInt(st.nextToken());
			if (t < 0) {
				N--;
				continue;
			}
			sum += t;
		}
		
		System.out.println(sum/(double)N);
		br.close();
	}
}
