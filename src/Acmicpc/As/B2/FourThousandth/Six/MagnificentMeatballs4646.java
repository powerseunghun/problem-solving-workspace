package Acmicpc.As.B2.FourThousandth.Six;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MagnificentMeatballs4646 {
	static int[] a = null, b = null;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		String str = null;
		int n = 0;
		boolean flag = false;
		
		while(true) {
			str = br.readLine();
			n = Integer.parseInt(str.split(" ")[0]);
			if (n == 0) break;
			a = new int[n];
			b = new int[n];
			flag = false;
			for (int i = 1, v = 0; i <= n; i++) {
				v = Integer.parseInt(str.split(" ")[i]);
				a[i-1] = v;
				b[i-1] = a[i-1];
			}
			for (int i = 1; i < a.length; i++) {
				a[i] += a[i-1];
			}
			for (int i = b.length-2; i >= 0; i--) {
				b[i] += b[i+1];
			}
			
			for (int i = 1; i < a.length && !flag; i++) {
				if (a[i-1] == b[i]) {
					sb.append("Sam stops at position ").append(i).append(" and Ella stops at position ").append(i+1).append(".\n");
					flag = true;
				}
			}
			if (!flag) {
				sb.append("No equal partitioning.").append("\n");
			}
		}
		
		System.out.print(sb.toString());
		br.close();
	}
}
