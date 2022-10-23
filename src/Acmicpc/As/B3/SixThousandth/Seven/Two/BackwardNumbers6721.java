package Acmicpc.As.B3.SixThousandth.Seven.Two;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BackwardNumbers6721 {
	static long func(String tmp) {
		StringBuilder sb1 = new StringBuilder(tmp.split(" ")[0]);
		StringBuilder sb2 = new StringBuilder(tmp.split(" ")[1]);
		long res = Long.parseLong(sb1.reverse().toString()) + Long.parseLong(sb2.reverse().toString());
		return Long.parseLong(new StringBuilder(res+"").reverse().toString());
	}
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		String tmp = null;
		int N = Integer.parseInt(br.readLine());
		
		while(N-- > 0) {
			tmp = br.readLine();
			sb.append(func(tmp) + "\n");
		}
		
		System.out.print(sb.toString());
		br.close();
	}
}
