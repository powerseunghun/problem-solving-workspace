package Acmicpc.As.B3.ThirtyThousandth.Two.Three;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class FarmersMarket32305 {
	static final int dozen = 12;
	static int func(int n) {
		return n%dozen == 0 ? n/dozen : n/dozen+1;
	}
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		int M = Integer.parseInt(str.split(" ")[0]);
		int N = Integer.parseInt(str.split(" ")[1]);
		int D = Integer.parseInt(br.readLine());
		
		System.out.println(func(M*N) * D);
		br.close();
	}
}
