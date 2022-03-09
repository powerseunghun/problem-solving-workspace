package Acmicpc.OrderSubmit.FiveThousandth.Nine;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class OddEven5988 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		String tmp = null;
		int N = Integer.parseInt(br.readLine());
		
		for (int i = 0; i < N; i++) {
			tmp = br.readLine();
			if ((tmp.charAt(tmp.length()-1) - '0') % 2 == 0) {
				sb.append("even\n");
			}
			else sb.append("odd\n");
		}
		
		System.out.print(sb.toString());
		br.close();
	}
}
