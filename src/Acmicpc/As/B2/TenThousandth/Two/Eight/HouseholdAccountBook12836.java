package Acmicpc.As.B2.TenThousandth.Two.Eight;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class HouseholdAccountBook12836 {
	static long[] arr = null;
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		String str = br.readLine();
		int N = Integer.parseInt(str.split(" ")[0]);
		int Q = Integer.parseInt(str.split(" ")[1]), c = 0, p = 0, qx = 0;
		arr = new long[N+1];
		
		while(Q-- > 0) {
			str = br.readLine();
			c = Integer.parseInt(str.split(" ")[0]);
			p = Integer.parseInt(str.split(" ")[1]);
			qx = Integer.parseInt(str.split(" ")[2]);
			if (c == 1) {
				arr[p] += qx;
			} else {
				long sum = 0;
				for (int i = p; i <= qx; i++) {
					sum += arr[i];
				}
				sb.append(sum).append("\n");
			}
		}
		
		System.out.print(sb.toString());
		br.close();
	}
}
