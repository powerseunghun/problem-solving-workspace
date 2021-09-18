package SWExpertAcademy.D3.ThreeThousandth.Four;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class GetThreeSum3408 {
	static long getSum(int a1, int d, long n) {
		long t = n * (2 * a1 + (n-1) * d);
		return t / 2;
	}
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int T = Integer.parseInt(br.readLine());
		long N = 0, S1 = 0, S2 = 0, S3 = 0;
		for (int i = 1; i <= T; i++) {
			N = Long.parseLong(br.readLine());
			S1 = (N*(N+1))/2;
			S2 = getSum(1, 2, N);
			S3 = getSum(2, 2, N);
			sb.append("#" + i + " " + S1 + " " + S2 + " " + S3 + "\n");
		}
		System.out.print(sb.toString());
	}
}
