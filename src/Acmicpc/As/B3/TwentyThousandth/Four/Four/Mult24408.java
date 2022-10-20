package Acmicpc.As.B3.TwentyThousandth.Four.Four;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Mult24408 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int N = Integer.parseInt(br.readLine()), a = 0, b = 1001;
		boolean flag = false;
		
		while (N-- > 0) {
			a = Integer.parseInt(br.readLine());
			if (!flag) {
				b = a;
				flag = true;
				continue;
			}
			
			if (flag && a % b == 0) {
				sb.append(a + "\n");
				b = 1001;
				flag = false;
			}
		}
		
		System.out.print(sb.toString());
		br.close();
	}
}
