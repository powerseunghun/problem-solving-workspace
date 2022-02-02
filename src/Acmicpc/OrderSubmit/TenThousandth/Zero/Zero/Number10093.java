package Acmicpc.OrderSubmit.TenThousandth.Zero.Zero;

import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;

public class Number10093 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String tmp = br.readLine();
		StringBuilder sb = new StringBuilder();
		long a = Long.parseLong(tmp.split(" ")[0]);
		long b = Long.parseLong(tmp.split(" ")[1]);
		
		if (a > b) {
			long t = a;
			a = b;
			b = t;
		}
		
		if (a == b) {
			System.out.println("0");
			return;
		}
		System.out.println(Math.abs(b-a-1));
		for (long i = a+1; i < b; i++) {
			sb.append(i + " ");
		}
		
		System.out.println(sb.toString());
		br.close();
	}
}
