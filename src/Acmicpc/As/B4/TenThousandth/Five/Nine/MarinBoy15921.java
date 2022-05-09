package Acmicpc.As.B4.TenThousandth.Five.Nine;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class MarinBoy15921 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine()), sum = 0;
		if (N == 0) {
			System.out.println("divide by zero");
			return;
		}
		StringTokenizer st = new StringTokenizer(br.readLine());
		while (st.hasMoreTokens()) {
			sum += Integer.parseInt(st.nextToken());
		}
		
		System.out.printf("%.2f", (double)sum/sum);
		br.close();
	}
}
