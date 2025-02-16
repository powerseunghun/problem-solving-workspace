package Acmicpc.As.B2.NineThousandth.Five;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FraudBusters9584 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		String str = br.readLine(), t = null;
		int N = Integer.parseInt(br.readLine()), res = 0;
		boolean flag = true;
		
		while(N-- > 0) {
			t = br.readLine();
			flag = true;
			for (int i = 0; flag && i < t.length(); i++) {
				if (str.charAt(i) == '*') continue;
				if (str.charAt(i) != t.charAt(i)) {
					flag = false;
				}
			}
			if (flag) {
				res++;
				sb.append(t).append("\n");
			}
		}
		
		System.out.println(res);
		System.out.print(sb.toString());
		br.close();
	}
}
