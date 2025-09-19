package Acmicpc.As.B5.ThirtyThousandth.Four.Four;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Floors34412 {
	static final int l = 13;
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		
		System.out.println(N >= l ? N+1 : N);
		br.close();
	}
}
