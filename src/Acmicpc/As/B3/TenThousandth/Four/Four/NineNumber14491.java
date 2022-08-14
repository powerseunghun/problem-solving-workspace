package Acmicpc.As.B3.TenThousandth.Four.Four;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class NineNumber14491 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int T = Integer.parseInt(br.readLine());
		
		while (T != 0) {
			sb.append(T%9);
			T /= 9;
		}
		
		System.out.println(sb.reverse().toString());
		br.close();
	}
}
