package Acmicpc.As.B2.TenThousandth.Four.Five;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class OuterTriangleSum14542 {
	static int getSum(String str, int flag) {
		int sum = 0;
		if (flag == 0) {
			for (int i = 0; i < str.split(" ").length; i++) {
				sum += Integer.parseInt(str.split(" ")[i]);
			}
		} else {
			String[] strs = str.split(" ");
			sum += Integer.parseInt(strs[0]);
			sum += Integer.parseInt(strs[strs.length-1]);
		}
		
		return sum;
	}
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int C = 1, N = 0, sum = 0;
		String str = null;
		
		while(true) {
			N = Integer.parseInt(br.readLine());
			if (N == 0) break;
			
			sum = 0;
			for (int j = 0; j < N; j++) {
				str = br.readLine();
				sum += getSum(str, (j==0 || j==N-1) ? 0 : 1);
			}
			sb.append("Case #").append(C++).append(":").append(sum).append("\n");
		}
		
		System.out.print(sb.toString());
		br.close();
	}
}
