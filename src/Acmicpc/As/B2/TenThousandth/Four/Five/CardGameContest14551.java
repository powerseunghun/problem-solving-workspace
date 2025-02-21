package Acmicpc.As.B2.TenThousandth.Four.Five;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CardGameContest14551 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		int N = Integer.parseInt(str.split(" ")[0]), A = 0;
		int M = Integer.parseInt(str.split(" ")[1]), res = 1;
		
		while(N-- > 0) {
			A = Integer.parseInt(br.readLine());
			if (A == 0) continue;
			res = res*A%M;
		}
		
		System.out.println(res%M);
		br.close();
	}
}
