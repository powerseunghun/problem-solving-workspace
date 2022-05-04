package Acmicpc.As.B4.TenThousandth.Three.One;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class DoNotTouchAnything13136 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String tmp = br.readLine();
		long R = Long.parseLong(tmp.split(" ")[0]);
		long C = Long.parseLong(tmp.split(" ")[1]);
		long N = Long.parseLong(tmp.split(" ")[2]);
		
		System.out.println((R % N == 0 ? R/N : R/N+1) * (C % N == 0 ? C/N : C/N+1));
		br.close();
	}
}
