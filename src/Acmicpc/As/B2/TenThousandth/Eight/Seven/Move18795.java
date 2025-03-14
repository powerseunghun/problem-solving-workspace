package Acmicpc.As.B2.TenThousandth.Eight.Seven;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Move18795 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = null;
		long sum = 0;
		br.readLine();
		
		for (int i = 0; i < 2; i++) {
			st = new StringTokenizer(br.readLine());
			while (st.hasMoreTokens()) {
				sum += Integer.parseInt(st.nextToken());
			}
		}
		
		System.out.println(sum);
		br.close();
	}
}
