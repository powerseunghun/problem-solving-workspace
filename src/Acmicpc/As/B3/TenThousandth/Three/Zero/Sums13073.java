package Acmicpc.As.B3.TenThousandth.Three.Zero;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Sums13073 {
	static int calc(int a, int d, int n) {
		return (n*(2*a + (n-1)*d))/2;
	}
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int T = Integer.parseInt(br.readLine()), n = 0;
		int sum1 = 0, sum2 = 0, sum3 = 0;
		
		while(T-- > 0) {
			n = Integer.parseInt(br.readLine());
			sum1 = calc(1, 1, n);
			sum2 = calc(1, 2, n);
			sum3 = calc(2, 2, n);
			sb.append(sum1 + " " + sum2 + " " + sum3 + "\n");
		}
		
		System.out.print(sb.toString());
		br.close();
	}
}
